package javaProgramms;

public class LargestAndSmallestNumber {

	public static void main(String[] args) {
		int numbers[]= {10,30,20,567,999,34567,99,-1};
		int largest=numbers[0];
		int smallest=numbers[0];
		for(int i=0;i<numbers.length;i++) {
			
			if(numbers[i]>largest) {
				largest=numbers[i];
			}else if(numbers[i]<smallest) {
				smallest=numbers[i];
			}
			}
			System.out.println("largest number is:"+largest);
			System.out.println("smallest number is:"+smallest);
		

	}

}
