package PracticeJava;

public class largestAndSmallestNumber {

	public static void main(String[] args) {
		
		int numbers[]= {-10,30,24,56,78,90,-2,-1};
		int largest=numbers[0];
		int smallest=numbers[0];
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]>largest) {
				largest=numbers[i];
			}else if(numbers[i]<smallest) {
				smallest=numbers[i];
			}
			}
		System.out.println("largest numbers is:"+largest);
	   System.out.println("smallest number is:"+smallest);
		}

	}


