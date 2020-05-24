package sort;

public class insertSort {
	public static void main(String[] args) {
		int A[]= {2,1,4,3};
		InsertSort(A);
		for(int i=0;i<A.length;i++) {
			System.out.println(A[i]);
		}
	}
	static void InsertSort(int A[]) {
		int len=A.length;
		for(int i=0;i<len;i++) {
			int temp=A[i];
			int j=i-1;
			for(;j>=0&&temp<A[j];j--) {
				A[j+1]=A[j];
			}
			A[j+1]=temp;
		}
	}
}
