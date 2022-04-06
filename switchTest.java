import java.util.*;
public class switchTest {
	/*	    	1 : + (Addition) a + b
	2 : - (Subtraction) a - b
	3 : * (Multiplication) a * b
	4 : / (Division) a / b
	5 : % (Modulo or remainder) a % b
	*/
	public static void main(String[]args){
		 Scanner sc=new Scanner(System.in);
			System.out.println("ENter number 1  ::");
			int a=sc.nextInt();
			System.out.println("ENter number 2  ::");
			int b=sc.nextInt();
	       System.out.println("Choose Operation : 1. + 2. - 3./ 4. %  ::");
	      
	       int o=sc.nextInt();
	       switch(o){
	       case 1 : 
	       System.out.print(" 1- Addition is :");
	       System.out.println(a+b);
	       break;
	       case 2 : 
	       System.out.print(" 2- Multiplication is : ");
	       System.out.println(a*b);
	       break;
	       case 3 : 
	       System.out.print(" 3- Division is : ");
	       System.out.println(a/b);
	       break;
	       case 4 : 
	       System.out.print(" 4- Modulo is : ");
	       System.out.println(a%b);
	       break;
	       }
	}
}
