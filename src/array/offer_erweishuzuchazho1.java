package array;

public class offer_erweishuzuchazho1 {
	public static void main(String[] args) {
		int[][] array  = {{1,2,3,4},{2,3,4,5},{3,4,5,6},{4,5,6,7}};
		int target=8;
		Solution_offer_1 solution=new Solution_offer_1();
		System.out.println(solution.Find(target, array));
	}
}
class Solution_offer_1 {
    public boolean Find(int target, int [][] array) {
    	int row=array.length-1;
    	int col=0;
    	while(row>=0&&col<array[0].length) {
    		if(array[row][col]==target) {
    			return true;
    		}else if(target>array[row][col]){
    			col++;
    		}else {
    			row--;
    		}
    	}
    	return false;
    }
}