package array;

public class BullsAndCows299 {
	public static void main(String[] args) {
		String secret="1123";
		String guess="0111";
		Solution299 solution=new Solution299();
		System.out.print(solution.getHint(secret, guess));
	}
}
class Solution299 {
    public String getHint(String secret, String guess) {
    	int aCount=0;
    	int bCount=0;
    	StringBuilder guess1=new StringBuilder(guess);
    	int[] secretCount=new int[10];
    	for(int i=0;i<secret.length();i++) {
    		char temp=secret.charAt(i);
    		if(temp==guess.charAt(i)) {
    			aCount++;
    			guess1.replace(i,i+1,"A");
    		}else {
    			secretCount[temp-'0']++;
    		}
    	}
    	for(int i=0;i<guess1.length();i++) {
    		int temp=guess1.charAt(i)-'0';
    		if(temp!=17&&secretCount[temp]!=0) {
    			bCount++;
    			secretCount[temp]--;
    		}
    	}
    	return String.valueOf(aCount)+"A"+String.valueOf(bCount)+"B";
    }
}