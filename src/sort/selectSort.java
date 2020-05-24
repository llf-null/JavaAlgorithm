package sort;

public class selectSort {
	public static void main(String[] args) {
		int A[]= {2,1,4,3};
		SelectSort(A);
		for(int i=0;i<A.length;i++) {
			System.out.println(A[i]);
		}
	}
	static void SelectSort(int A[]) {
		int n=A.length;
		for(int i=n-1;i>=0;i--) {
			int maxIndex=i;
			for(int j=0;j<i;j++) {
				if(A[j]>A[maxIndex]) {
					maxIndex=j;
				}
			}
			int temp=A[i];
			A[i]=A[maxIndex];
			A[maxIndex]=temp;
		}
	}
}
