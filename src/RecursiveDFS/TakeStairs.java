package RecursiveDFS;
import java.util.*;
public class TakeStairs {
	static int Div(int n) {
		if(n==1) return 1;
		if(n==2) return 2;
		return Div(n-1)+Div(n-2);
		
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T=in.nextInt();
		while(T--!=0) {
			int n=in.nextInt();
			System.out.print(Div(n));
		}
		
	}
}
