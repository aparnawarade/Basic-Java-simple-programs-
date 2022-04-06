package Patterns;
import java.util.*;
public class pyramidNUmber {
/*	* * * * * * * * * * 
     1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5 
	* * * * * * * * * * */
	
	public static void main (String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rows ");
		int n = sc.nextInt();
		
		for (int i=1;i<=n ;i++){
				
				for (int j=(n+1)-i; j>1; j--){
					System.out.print(" ");
				}
				for (int j=1;j<=i ;j++){
					System.out.print(i + " ");
				}
				System.out.println();
		}
	}

}
