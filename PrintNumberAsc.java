/*
 * Q2. Print numbers from 1 to 5.
 */
public class PrintNumberAsc {
	public static void main(String[] args) {
		printAsc(1);
	}
	public static void printAsc(int n ){
		if(n==6){
			return;
		}
		//Work done 
		System.out.println(n);
		printAsc(n+1);
	}

}
