package Patterns;
import java.util.*;
public class patternNumberTraingle {
/*	
1
12
123
1234
12345
 */
	
	public static void main (String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rows ");
		int n = sc.nextInt();
		int number=1;
		
		for (int i=1;i<=n ;i++){
				for (int j=1;j<=i ;j++){
					System.out.print(number + " ");
					number++; 
				}
				System.out.println();
		}
	}

}
