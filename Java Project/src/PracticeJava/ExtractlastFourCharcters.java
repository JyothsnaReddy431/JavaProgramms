package PracticeJava;

public class ExtractlastFourCharcters {

	public static void main(String[] args) {
		String str="Automation123";
		String lastfourechar=str.substring(str.length()-3,str.length());
		System.out.println(lastfourechar);
		String firstthreechar=str.substring(0,3);
		System.out.println(firstthreechar);

	}

}
