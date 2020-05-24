package array;

public class RotateArray189 {
	public static void main(String[] args) {
		int[] nums= {-1};
		int k=2;
		Solution189 solution=new Solution189();
		solution.rotate(nums, k);
		for(int i: nums) {
			System.out.println(i);
		}
	}
}
class Solution189 {
	    public void rotate(int[] nums, int k) {
	    	//加这句防止出现转的圈数比数组本身长度还大
	    	k%=nums.length;
	        reverse(nums,0,nums.length-1);
	    	reverse(nums,0,k-1);
	    	reverse(nums,k,nums.length-1);
	    }
	    public void reverse(int[] nums,int start,int end) {
	            while(start<end&&start>=0&&end>=0) {
	                int temp=0;
	                temp=nums[end];
	                nums[end]=nums[start];
	                nums[start]=temp;
	                start++;
	                end--;
	            }
	        }
	    }