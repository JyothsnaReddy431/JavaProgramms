package javaProgramms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Duplicatecharecters {

	public static void main(String[] args) {
		String str= "Automation";
		Duplicatecharecters("a");
		Duplicatecharecters(str);
		Duplicatecharecters("");
	}
		public static void Duplicatecharecters(String str){
			if(str==null) {
				System.out.println("Null string");
				return;
			}
			if(str.isEmpty()) {
				System.out.println("Empty string");
				return;
			}
			if(str.length()==1) {
				System.out.println("single");
				
			}
		
		
	char words[]= str.toCharArray();
	Map<Character ,Integer> charmap= new HashMap<Character ,Integer>();
		for(Character ch:words){
			if(charmap.containsKey(ch)) {
				charmap.put(ch,charmap.get(ch)+1);
			}else {
				charmap.put(ch,1);
			}
			Set<Map.Entry<Character,Integer>>entrySet=charmap.entrySet();
			  for(Map.Entry<Character,Integer>entry:entrySet){
				
					if(entry.getValue()>1) {
						System.out.println(entry.getKey()+":"+entry.getValue());
					}
			}
		
	
		
		}
		}
}
		
		
		
		
		
		
		
		
		
		
		
		

	


