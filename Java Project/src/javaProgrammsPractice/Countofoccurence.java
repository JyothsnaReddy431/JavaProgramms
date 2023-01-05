package javaProgrammsPractice;

public class Countofoccurence {
	String str="JJJJyothsna";
	public static void main(String[] args) {
	
	
	getoccurenceofString("JJJJyothsna",'J');
	getoccurenceofString("JJJJyothsnaaa",'a');
	}
	
	public static void getoccurenceofString(String str,char val) {
		int count=0;
		for(char ch:str.toCharArray()) {
			if(ch==val) {
				count++;
			}
			
		}
		System.out.println("occurence of given string:"+count);
	}

	
		

	}


