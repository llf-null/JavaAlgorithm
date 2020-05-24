package array;

public class FindCelebrity227 {
	static int[][] people=new int[][] {
		{0,1,1,0,1},
		{0,0,1,0,1},
		{0,0,0,0,1},
		{0,0,1,0,1},
		{0,0,0,0,0}
		};
	public static void main(String[] args) {
		int num=people.length;
		int candidate=0;
		for(int i=0;i<num;i++) {
			if(knows(candidate,i)==1) {
				candidate=i;
			}
		}
		boolean has_celebrity=true;
		for(int k=0;k<num;k++) {
			if(people[candidate][k]==1||(people[k][candidate]==0 && k!=candidate)) {
				 has_celebrity=false;
			}
		}
		if(has_celebrity) {
			System.out.println(candidate);
		}
		else{System.out.print("无明星");}
		
}
	public static int knows(int a ,int b) {
		return people[a][b];
}
}