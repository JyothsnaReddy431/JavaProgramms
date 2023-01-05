package javaProgrammsPractice;

public class oddandEven {
	
	public static void main(String[] args) {
		int num[] = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0;i<num.length;i++) {
			if(num[i]%2==0) {
				System.out.println("even numbers:"+num[i]);
				
			}
		}
 for(int j=0;j<num.length;j++) {
	 if(num[j]%2!=0) {
		System.out.println("odd numbers:"+num[j]); 
	 }
 }
	}

}
