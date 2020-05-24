package RecursiveDFS;

public class Factorial {
	static int fact(int n) {
		if(n==0) return 1;
		return n*fact(n-1);
		
	}
	public static void main(String[] args) {
		int n=5;
		int result=fact(5);
		System.out.print(result);
	}
}
