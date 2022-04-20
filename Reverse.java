package Simple;

import java.util.Stack;

public class Reverse {
	public static void main(String[] args ){
		
		String s= "abcdef";
		System.out.println("Reverse String with recussion ");
		reverseString(s,s.length()-1,"");
		
		System.out.println("Reverse String without recussion with stack ");
		reverseStringStack(s);
		
	}
	private static void reverseStringStack(String s) {
		Stack stack=new Stack();
		for(int i=0;i<s.length();i++){
			stack.push(s.charAt(i));
		}
		while(!stack.empty()){
			System.out.print(stack.pop());
		}
		
	}
	public static void reverseString(String str,int index, String newString){
		if(index==0){
			System.out.println(newString+str.charAt(0));
			return;
		}
		reverseString(str,index-1,newString+str.charAt(index));
	}
	
	
}

