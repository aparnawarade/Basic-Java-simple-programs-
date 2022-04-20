package Simple;

import java.util.HashSet;

/*
 * Q7. Print all the subsequences of a string.
 */
public class sebsequence {
	public static void main(String[] args) {
		System.out.println("Hello");
		printSubsequence("abc",0,"");
		System.out.println("=============");
		HashSet<String> hashset=new HashSet<>();
		printUniqueSubsequence("aaa",0,"",hashset);
	}
	private static void printUniqueSubsequence(String string, int i, String result, HashSet<String> hashset) {
		if(string.length()==i){
			if(hashset.contains(result))
				return;
			
			hashset.add(result);
			System.out.println(result);
			return;
		}
		
		
		printUniqueSubsequence(string, i+1, result, hashset);
		printUniqueSubsequence(string, i+1, result+string.charAt(i), hashset);
		
		
	}
	public static void printSubsequence(String src , int index, String result ){
		if(src.length()==index){
			System.out.println(result);
			return;
		}
		//not chosing to attach
		printSubsequence(src,index+1,result);
		// chosing to attach
		printSubsequence(src, index+1, result+src.charAt(index));
	}
}
