package javaProgramms;

public class OccurenceofString {
	
	public static void main(String[] args) {
		String str="JJJJyothsnaKKK555";
		getoccurenceofstring(str,'J');
		getoccurenceofstring(str,'K');
		getoccurenceofstring(str,'5');
		
	}
		public static void getoccurenceofstring(String str,char val){
			
			int count=0;
			for(char ch:str.toCharArray()) {
				if(ch==val) {
					count++;
				}
			}
			System.out.println(val+":"+count);
		}
		
		
		
		
		
		
		
		
	}


