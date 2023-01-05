package javaProgramms;

public class VowelsCount {
	
		public static boolean isvowel(char t) {
			return t=='a' || t=='e' ||t=='i' || t=='o' || t=='u'||
					t=='A' ||t=='E' ||t=='I' ||t=='O' ||t=='U';
			
		
		}
		public static void main(String[] args) {
			String str="Testingmangoes";
			int Vcount=0;
			for(int x=0;x<str.length();x++) {
				if(isvowel(str.charAt(x))) {
					Vcount++;
				}
			}
		System.out.println("vowelcount of given string is:"+Vcount);
	}

}
