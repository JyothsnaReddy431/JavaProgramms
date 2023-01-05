package javaProgramms;

public class SubstringPresentInString {
	
	
	public static boolean Substring(String main,String sub) {
		return main.matches("(.*)"+sub+"(.*)");
	}
	
	public static boolean Substring2(String main,String sub) {
		return main.contains(sub);
	}
	
	public static boolean Substring3(String main,String sub) {
		return main.indexOf(sub)!=1;
	}
	

	public static void main(String[] args) {
		//System.out.println(Substring("Jyothsna learning intrest","intrest"));
      // System.out.println(Substring2("test Automation","test"));
       System.out.println(Substring3("Automation manual","Test"));
	}

}
