package array;

import java.util.Arrays;

public class DeleteElement26 {
	public static void main(String[] args) {
		int[] nums= {1,1,3,3,2,4,5,3,2,2};
		Arrays.parallelSort(nums);
		Solution26 solution=new Solution26();
		System.out.println(solution.removeDuplicates(nums));
	}
}
class Solution26 {
    public int removeDuplicates(int[] nums) {
    	int i=0;
    	for(int j=1;j<nums.length;j++) {
    		if(nums[j]!=nums[i]) {
    			i++;
    			nums[i]=nums[j];
    		}
    	}
    	return i+1;
    }
}