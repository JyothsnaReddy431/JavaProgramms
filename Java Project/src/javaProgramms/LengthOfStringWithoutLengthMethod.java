package javaProgramms;

public class LengthOfStringWithoutLengthMethod {

	public static void main(String[] args) {
		String str="Automation";
		System.out.println(str.toCharArray().length);
		System.out.println(str.lastIndexOf(""));
		System.out.println(str.split("").length);
		
		int count=0;
		for(char ch:str.toCharArray()) {
			count++;
		}
		System.out.println(count);

	}

}
