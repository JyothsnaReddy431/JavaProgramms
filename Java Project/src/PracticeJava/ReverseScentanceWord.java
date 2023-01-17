package PracticeJava;

public class ReverseScentanceWord {

	public static void main(String[] args) {
		String str=" test data Automation test data scance";
		String rev="";
		int len=str.length();
		String []arr=str.split(" ");
		for(int i=arr.length-1;i>=0;i--) {
			rev=rev+arr[i]+" ";
		}
		System.out.println(rev);
	}

}
