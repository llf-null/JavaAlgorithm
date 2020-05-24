package array;

public class offer_duplicate_num_in_array {
	public static void main(String[] args) {
		int[] array  = {1,4,3,6,5,2,2};
		int length=7;
		Solution_offer2 solution=new Solution_offer2();
		int[] duplication= {};
		System.out.println(solution.duplicate2(array,length,duplication));
		}
}
class Solution_offer2 {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
	boolean duplicate2(int numbers[],int length,int [] duplication) {
		if(length<=0||numbers==null) {
			return false;
		}
		int index=0;
		for(int i=0;i<length;i++) {
			index=numbers[i];
			if(index>=length) {
				index-=length;
			}
			if(numbers[index]>=length) {
				duplication[0]=index;
				return true;
			}
			numbers[index]+=length;
			
		}
		return false;
    }
}