/*
 * Q5. Print the fibonacci sequence till nth term.
 */
public class fibonacci {
	public static void main(String[] args) {
		
		int a =0;
		int b=1;
		System.out.print(a +" ");
		System.out.print(b +" ");
		int n=8;
		calFibo(a,b,n-2);
	
	}

	private static void calFibo(int a,int b, int n) {
		if(n==0){
			return;
		}
		int c= a+b;		
		System.out.print(c +" ");
		calFibo(b, c, n-1);
	}

}
