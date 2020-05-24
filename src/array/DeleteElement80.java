package array;

import java.util.Arrays;

public class DeleteElement80 {
	public static void main(String[] args) {
	int[] nums= {1,1,2,2,2,2,3,3,3,3};
	Arrays.parallelSort(nums);
	Solution80 solution=new Solution80();
	System.out.printf("总数 %d",solution.removeDuplicates(nums));
}
}
class Solution80 {
    public int removeDuplicates(int[] nums) {
    	int i =0;
    	boolean delete=false;
    	for(int j=1;j<nums.length;j++) {
    		if(nums[j]!=nums[i]) {
    			i++;
    			nums[i]=nums[j];
    			delete=false;
    		}else {
    			if(delete) {
    				continue;
    			}
    			i++;
    			nums[i]=nums[j];
    			delete=true;
    		}
    	}
    	for(int k=0;k<i+1;k++) {
    		System.out.println(nums[k]);
    	}
    	return i+1;
    }
}