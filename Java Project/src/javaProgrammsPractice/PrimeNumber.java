package javaProgrammsPractice;

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

	public static void main(String[] args) {
		
System.out.println("4 is prime number:"+isprimeNumber(4));
System.out.println("0 is prime number:"+isprimeNumber(0));

System.out.println("2 is prime number:"+isprimeNumber(2));

System.out.println("-1 is prime number:"+isprimeNumber(-1));

	}

}
