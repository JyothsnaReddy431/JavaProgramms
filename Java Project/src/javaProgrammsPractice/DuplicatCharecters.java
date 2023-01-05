package javaProgrammsPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicatCharecters {
	public static void main(String[] args) {
		String str="AutomationTesting";
		FindDuplicateCharecters(str);
	}
		public static void FindDuplicateCharecters(String str) {
			
			if(str==null) {
				System.out.println("null string");
				return;
			}
			if(str.isEmpty()) {
				System.out.println("Empty string");
				return;
			}
			if(str.length()==1) {
				System.out.println("single charecter");
				return;
			}
			
			char words[]=str.toCharArray();
			Map<Character,Integer> charmap=new HashMap<Character,Integer>();
			for(Character ch:words) {
				if(charmap.containsKey(ch)) {
					charmap.put(ch, charmap.get(ch)+1);
				}else {
					charmap.put(ch, 1);
				}
				
			}
			Set<Map.Entry<Character,Integer>>entryset=charmap.entrySet();
			for(Map.Entry<Character, Integer>entry:entryset){
				if(entry.getValue()>1) {
					System.out.println(entry.getKey()+":"+entry.getValue());
				}
				
			}
		}

	}


