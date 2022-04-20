package Simple;
/*
 * Q3. Find the occurrence of the first and last occurrence of an element using recursion.
 */
public class occurrence {
	public static int first=-1;
	public static int last=-1;
	public static void main(String[] args) {
		String s="abghahagdkj";
		findOccurrence(s,'a',0);
	}

	private static void findOccurrence(String s, char c,int index) {
		
		if(s.charAt(index)==c){
			if(first ==-1)
				first=index;
			else 
				last=index;
		}
		if(s.length()-1==index){
			System.out.println(first);
			System.out.println(last);
			return;
		}
		findOccurrence(s,'a',index+1);
	}
	

	
}
