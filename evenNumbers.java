import java.util.*;
public class evenNumbers {
	public static void main(String[]args){
		System.out.println("Enter Number : "); 
		Scanner sc=new Scanner(System.in);
	       int n=sc.nextInt();

	            
	       for (int i=0;i<=n;i++){
	       if(i%2==0){
	       System.out.print ( i+" ");
	       }
	       } 
	}
}
