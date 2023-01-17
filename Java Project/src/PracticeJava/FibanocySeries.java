package PracticeJava;

public class FibanocySeries {

	public static void main(String[] args) {
		int first=0;
		int second=1;
			int num=10;
			for(int i=0;i<=num;i++) {
				System.out.println(first+ " ");
				int thredd=first+second;
				first=second;
				second=thredd;
				
			}
			

	}

}
