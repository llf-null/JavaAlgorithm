package sort;

public class FindK {
	public static void main(String[] args) {
		int A[]= {2,1,4,3,6};
		int k=5;
		System.out.print(findK(A,k-1));
	}
	static int findK(int[] A,int k) {
		int low=0,high=A.length-1;
		int mid=part(A,low,high);
		while(mid!=k) {
			if(mid<k) {
				low=mid+1;
			}else {
				high=mid-1;
			}
			mid=part(A,low,high);
		}
		return A[k];
	}
	static int part(int[] A,int low,int high) {
		int i=low,j=high,temp=A[low];
		while(i<j) {
			while(i<j&&A[j]>=temp) j--;
			A[i]=A[j];
			while(i<j&&A[i]<=temp) i++;
			A[j]=A[i];
		}
		A[i]=temp;
		return i;
	}
	
}
