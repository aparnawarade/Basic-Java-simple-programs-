package Patterns;
import java.util.*;
public class pyramidReverse {
/*	* * * * * * * * * * 
7 7 7 7 7 7 7 
 6 6 6 6 6 6 
  5 5 5 5 5 
   4 4 4 4 
    3 3 3 
     2 2 
      1  
	* * * * * * * * * * */
	
	public static void main (String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rows ");
		int n = sc.nextInt();
		
		for (int i=n;i>=1 ;i--){
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
