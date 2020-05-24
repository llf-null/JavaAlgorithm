package sort;

public class QuickSort {
	public static void main(String[] args) {
		int A[]= {2,1,4,3,6,34,6,5,6,3,2,6,4};
		int n=A.length;
		quickSort(A,n);
		for(int i=0;i<A.length;i++) {
			System.out.println(A[i]);
		}
	}
	static void quickSort(int[] A,int n) {
		quickSort(A,0,n-1);
	}
	static void quickSort(int[] A,int low,int high) {
		if(low>=high) return;
		int mid=part(A,low,high);
		quickSort(A,low,mid);
		quickSort(A,mid+1,high);
	}
	static int part(int[] A,int low,int high) {
		int temp=A[low];
		int i=low,j=high;
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
