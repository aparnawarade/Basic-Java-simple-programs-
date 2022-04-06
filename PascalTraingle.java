package Patterns;
/*
 *  1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1

 */
public class PascalTraingle {
	public static void main(String[] args) {
		int n=5;
		for (int i=1;i<=n;i++){
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			 int C = 1;
	            for (int j = 1; j <= i; j++) {
	 
	                // The first value in a line is always 1
	                System.out.print(C + " ");
	                C = C * (i - j) / i;
	            }
			System.out.println();
		}
	}

}
