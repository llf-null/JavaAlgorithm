package sort;

public class MergeSort {
	public static void main(String[] args) {
		int A[]= {2,1,4,3};
		int n=4;
		mergeSort(A,n);
		for(int i=0;i<A.length;i++) {
			System.out.println(A[i]);
		}
	}
	static void mergeSort(int A[],int n) {
		mergeSort(A,0,n-1);
	}
	static void mergeSort(int A[],int low,int high) {
		if(low>=high) {
			return;
		}
		int mid=(high+low)/2;
		mergeSort(A,low,mid);
		mergeSort(A,mid+1,high);
		mergeArray(A,low,mid,high);
	}
	static void mergeArray(int[] A,int low,int mid,int high) {
		int[] b=new int[high-low+1];
		int i=low,j=mid+1,temp=0;
		while(i<=mid&&j<=high) {
			if(A[j]<A[i]) {
				b[temp++]=A[j++];
			}else {
				b[temp++]=A[i++];			
			}
		}
		while(i<=mid) {
			b[temp++]=A[i++];
		}
		while(j<=high) {
			b[temp++]=A[j++];
		}
		for(int x=low,k=0;x<=high;k++,x++) {
			A[x]=b[k];
		}
	}
}
