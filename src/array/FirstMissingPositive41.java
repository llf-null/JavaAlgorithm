package array;

public class FirstMissingPositive41 {
	public static void main(String[] args) {
		int[] nums= {1,2,0};
		Solution41 solution=new Solution41();
		System.out.println(solution.firstMissingPositive(nums));
	}
}
class Solution41 {
    public int firstMissingPositive(int[] nums) {
    	int temp=0;
    	for(int i=0;i<nums.length;i++) {
    		if(nums[i]<nums.length && nums[i]>0 && nums[i]!=i) {
        		temp=nums[nums[i]];
        		nums[nums[i]]=nums[i];
        		nums[i]=temp;
        		i--;
    		}
    	}
    	for(int i=1;i<nums.length;i++) {
    		if(nums[i]!=i) {
    			return i;
    		}
    	}
    	if(nums[0]==nums.length) {
    		return nums.length+1;
    	}
    	else {
    		return nums.length;
    	}
    }
}