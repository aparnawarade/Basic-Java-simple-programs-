package Simple;
/*
 * Q5. Move all ‘x’ to the end of the string. - O(n)
 */
public class movextoEnd {
	
public static void main(String[] args) {
	String s="axbxcxdxxxe";
	int cnt=0;
	String newSTring=moveX(s,0,"",0);
	
	System.out.println(newSTring);
}

private static String moveX(String s,int index,String newString,int cnt) {
	
	
	if(s.length()-1==index){
		newString=newString+s.charAt(index);
		newString=addx(newString,cnt);
		return newString;
	}
	if(s.charAt(index)=='x'){
		return moveX(s,index+1,newString,cnt+1);
	}
	else 
		return moveX(s,index+1,newString+s.charAt(index),cnt);
		
}

private static String addx(String newString, int cnt) {
	for (int i=0;i<cnt;i++){
		newString=newString+'x';
	}
	return newString;
}

}
