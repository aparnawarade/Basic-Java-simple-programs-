import java.util.*;
/*
 * Print the spiral order matrix as output for a given matrix of numbers. 
 */
public class ArrayExampleSpiralArray {
	public static void main(String[]args){
		
		int[][] twoDArray={ {1,5,7,9,10,11},{6,10,12,13,20,21},{9,25,29,30,32,41}};
		for (int i=0;i<3;i++) {
			for(int j=0;j<6;j++){
				System.out.print(twoDArray[i][j]+" ");
			}
			System.out.println();
			
		}
		System.out.println("------------------");
		for (int i=0;i<3;i++) {
			if(i==0 || i%2 ==0){
				for(int j=0;j<6;j++){
					System.out.print(twoDArray[i][j]+" ");
				}
			}
			else 
				for(int j=5;j>=0;j--){
					System.out.print(twoDArray[i][j]+" ");
				}
			
			System.out.println();
			
		}
		
	}
}
