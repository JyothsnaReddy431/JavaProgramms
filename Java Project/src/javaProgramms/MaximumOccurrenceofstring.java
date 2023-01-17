package javaProgramms;

public class MaximumOccurrenceofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="googlee";
		getoccurenc(str,'e');
	}
     
     public static void getoccurenc(String str, char val) {
		int count=0;
		for(char ch :str.toCharArray()) {
			if(ch==val) {
				count++;
			}
		}
     
		System.out.println(val +":" + count);
	
     }
	}

