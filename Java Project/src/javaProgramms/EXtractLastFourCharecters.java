package javaProgramms;

public class EXtractLastFourCharecters {

	public static void main(String[] args) {
		
		String str="Automation345";
		
		String lastDigits= str.substring(str.length()-3, str.length());
		System.out.println(lastDigits);
		
		String First3charecter=str.substring(0, 3);
		System.out.println(First3charecter);
		
		String middlecharecters=str.substring(3,str.length()-3);
		System.out.println(middlecharecters);
	}

}
