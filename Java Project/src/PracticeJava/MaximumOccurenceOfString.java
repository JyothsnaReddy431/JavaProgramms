package PracticeJava;

public class MaximumOccurenceOfString {

	public static void main(String[] args) {
		String str=" googleee";
		GetOccurenceofString(str,'g');
		GetOccurenceofString(str,'o');
		GetOccurenceofString(str,'e');
		
	}
		public static void GetOccurenceofString(String str,char val) {
			int count=0;
			for(char ch:str.toCharArray()) {
				if(ch==val) {
					count++;
				}	
			
		}
System.out.println("maximum occurence of givin string of g:"+count);

	}

}
