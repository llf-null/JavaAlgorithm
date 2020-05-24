package array;

import java.util.Arrays;
import java.util.LinkedList;

public class InsertInterval57 {
	public static void main(String[] args) {
		int[][] arrays2d  = {{1,5}};
		int[] newarrays2d= {2,3};
		Solution57 solution=new Solution57();
		int[][] result=solution.insert(arrays2d,newarrays2d);
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i][0]);
			System.out.println(result[i][1]);
		}
	}
}
class Solution57 {
    public int[][] insert(int[][] intervals,int[] newinterval) {
    	 LinkedList<int[]> output = new LinkedList<int[]>();
    	 int idx=0;
    	 int newstart=newinterval[0];
    	 int newend=newinterval[1];
    	 int n=intervals.length;
    	 if(intervals.length<1) {
    		 int[][] result= new int[1][2];
    		 result[0]=newinterval;
    		 return result;
    	 }
    	 while(idx<n&&intervals[idx][0]<newstart) {
    		 output.add(intervals[idx++]);
    	 }
    	 if(output.isEmpty()||newstart>output.getLast()[1]) {
    		 output.add(newinterval);
    	 }else {
    		 int[] interval=output.removeLast();
    		 interval[1]=Math.max(interval[1],newend );
    		 output.add(interval);
    	 }

    	 while(idx<intervals.length) {
        	 int[] interval=intervals[idx++];
        	 if(interval[0]>output.getLast()[1]) {
        		 output.add(interval);
        	 }else {
        		 int[] last=output.removeLast();
        		 last[1]=Math.max(last[1],interval[1]);
        		 output.add(last);
        	 }
    	 }
    	 return output.toArray(new int[output.size()][2]);
    }
}
