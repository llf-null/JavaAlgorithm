package array;

public class GasStation134 {
	public static void main(String[] args) {
		int[] gas  = {1,2,3,4,5};
		int[] cost = {3,4,5,1,2};
		Solution134 solution=new Solution134();
		System.out.print(solution.canCompleteCircuit(gas, cost));
	}
}
class Solution134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
    	int total_tank=0;
    	int current_tank=0;
    	int start_position=0;
    	for(int i=0;i<gas.length;i++) {
    		total_tank+=gas[i]-cost[i];
    		current_tank+=gas[i]-cost[i];
    		if(current_tank<0) {
    			start_position=i+1;
    			current_tank=0;
    		}
    	}
    	if(total_tank>=0) {
    		return start_position;
    	}else {
    		return -1;
    	}
    }
}
