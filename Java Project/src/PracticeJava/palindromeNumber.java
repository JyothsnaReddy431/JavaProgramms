package PracticeJava;

public class palindromeNumber {

	public static void palindromeNumber(int num) {
		int r=0;
		int sum=0;
		int t;
		t=num;
		while(num>0) {
			r=num%10;
			sum=sum*10+r;
			num=num/10;
		}
    if(t==sum) {
	System.out.println("palindrome number");
   }else {
	System.out.println("not a palindrome number");
}
	}
	public static void main(String[] args) {
		palindromeNumber(186);
}
}