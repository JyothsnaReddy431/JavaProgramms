package PracticeJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInString {

	public static void main(String[] args) {
		String inputstring="test data power in the test data";
		DuplicatewordsInString(inputstring);
		
	}
		public static void DuplicatewordsInString(String inputstring) {
			String words[]=inputstring.split(" ");
			Map<String ,Integer>wordcount=new HashMap<String,Integer>();
			for(String word:words) {
				if(wordcount.containsKey(word)) {
					wordcount.put(word, wordcount.get(word)+1);
						
					}else {
						wordcount.put(word, 1);
						
					}
					
				}
			Set<String>wordinstring=wordcount.keySet();
			for(String word:wordinstring){
				if(wordcount.get(word)>1){
					
					System.out.println(word+":"+wordcount.get(word));
					
				}
				
				
			}
			}
			
			
		}

	


