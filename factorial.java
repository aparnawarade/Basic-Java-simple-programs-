/*
 * Q4. Print factorial of a number n.
 * 5*4*3*2*1
 */
public class factorial {
	public static void main(String[] args) {
		int i=factorialCal(4);
		System.out.println(i);
	}

	private static int factorialCal(int i) {
		if(i==1){
			return 1 ; 
		}
		
		return i*factorialCal(i-1);
		
		
		
		
	}

}
