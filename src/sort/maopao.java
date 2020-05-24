package sort;

public class maopao {
	public static void main(String[] args) {
		int A[]= {2,1};
//		for(int i=0;i<A.length;i++) {
//			System.out.println(A[i]);
//		}
		bubbleSort(A);
		for(int i=0;i<A.length;i++) {
			System.out.println(A[i]);
		}
	}
	static void bubbleSort(int A[]) {
		int len=A.length;
		boolean isSort=true;
		for(int i=len-1;i>0;i--) {
			for(int j=1;j<=i;j++) {
				if(A[j]<A[j-1]) {
					int temp=A[j];
					A[j]=A[j-1];
					A[j-1]=temp;
					isSort=false;
				}
			}
			if(isSort) {
				break;
			}
		}
	}
}
