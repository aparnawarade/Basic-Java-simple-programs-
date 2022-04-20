/*
 * Q3. Print the sum of first n natural numbers.
 * 1+2+3+4+5+6
 */
public class SumOfNatural {

	public static void main(String[] args) {
		sum(6,0);
	
		
	}

	private static void sum(int i, int sumOfN) {
		//COndition 
		if(i==0){
			System.out.println(sumOfN);
			return;
		}
		
		//Work 
		sumOfN= sumOfN+i ; 
		sum(i-1,sumOfN);
		
	}
}
