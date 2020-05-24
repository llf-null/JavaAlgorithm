package array;

public class Element27 {
	public static void main(String[] args) {
		int[] nums={3,2,2,3};
		int val=3;
		Solution solution=new Solution();
		System.out.println(solution.removeElement(nums, val));
	}
}
class Solution {
    public int removeElement(int[] nums, int val) {
    	int j=0;
    	if(nums.length==0) {
    		return 0;
    	}
    	for(int i=0;i<nums.length;i++) {
    		if(nums[i]!=val) {
    			nums[j]=nums[i];
    			j++;
    		}
    	}
    	return j;
    }
}