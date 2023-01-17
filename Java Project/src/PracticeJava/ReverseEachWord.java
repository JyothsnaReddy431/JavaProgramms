package PracticeJava;

public class ReverseEachWord {

	public static void main(String[] args) {
		
		String str="i am the best person";
		String Result="";
		String [] arr=str.split(" ");
		for(String word:arr) {
			int j=word.length()-1;
			String Reverseword="";
			while(j>=0) {
				char ch=word.charAt(j);
				Reverseword=Reverseword+ch;
				j--;
			}
			Result=Result+Reverseword+" ";
		}
		
		System.out.println("Revesr each word in sentence:"+Result);
		
		
	}

}
