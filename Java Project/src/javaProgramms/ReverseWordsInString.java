package javaProgramms;

public class ReverseWordsInString {

	public static void main(String[] args) {
		String str="I love my java language";
		String rev="";
		String []arr=str.split(" ");
		for(int i=arr.length-1;i>=0;i--) {
			rev= rev+arr[i]+" ";
		
		}
       System.out.println("reverse words are:"+rev);
	}

}
