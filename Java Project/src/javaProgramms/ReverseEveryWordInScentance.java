package javaProgramms;

public class ReverseEveryWordInScentance {

	public static void main(String[] args) {
		String str="hey hellow world";
		
		String result="";
		String[]arr=str.split(" ");
		
		 for (String word:arr) {
			 int j=word.length()-1;
			 String reverseword="";
			 while(j>=0) {
				 
				 char ch=word.charAt(j);
				 reverseword=reverseword+ch;
				 j--;
			 }
			 result=result+reverseword+" ";
		 }
        System.out.println(result);
	}

}
 