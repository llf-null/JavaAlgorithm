package RecursiveDFS;

public class TheGreatestCommonDivisor {
	static int Div(int a,int b) {
		if(b==0) return a;
		return Div(b,a%b);
		
	}
	public static void main(String[] args) {
		int result=Div(4,18);
		System.out.print(result);
	}
}
