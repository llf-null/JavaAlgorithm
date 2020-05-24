package array;

import java.util.Arrays;

public class MergeIntervals56 {
	public static void main(String[] args) {
		int[][] arrays2d  = {{1,4},{2,3}};
		Solution56 solution=new Solution56();
		int[][] result=solution.merge(arrays2d);
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i][0]);
			System.out.println(result[i][1]);
		}
	}
}
class Solution56 {
    public int[][] merge(int[][] intervals) {
    	if(intervals.length<2) {
    		return intervals;
    	}
    	int j=0;
    	for(int i=1;i<intervals.length;i++) {
    		if(intervals[i][0]<=intervals[j][1]) {
    			if(intervals[i][1]>=intervals[j][1]) {
    				intervals[j][1]=intervals[i][1];
    			}else {
    				continue;
    			}
    		}
    			
    		else {
    			j++;
    			intervals[j][0]=intervals[i][0];
    			intervals[j][1]=intervals[i][1];
    		}
    	}
    	int[][] result=Arrays.copyOfRange(intervals, 0,j+1);
    	return result;
    }
}