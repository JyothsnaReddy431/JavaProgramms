package javaProgramms;

public class PrimeNumber {
	 public static boolean isprimeNumber(int num) {
		 if(num<=1) {
			 return false;
		 }
		 for(int i=2;i<num;i++) {
			 if(num%i==0) {
				 return false;
			 }
		 
		 }
		 return true;
	 }
public static void main(String[]args) {
	System.out.println("prime number is:"+isprimeNumber(7));
	
}
}
