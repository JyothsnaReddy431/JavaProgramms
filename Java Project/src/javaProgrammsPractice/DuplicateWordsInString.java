package javaProgrammsPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInString {

	public static void main(String[] args) {
		String inputstring="hey i am using java and interested java";
		DuplicateWords("hey i am using java and interested java");
	}
     public static void DuplicateWords(String inputstring) {
    	
    	 String words[]=inputstring.split(" ");
    	 Map<String,Integer> wordcount=new HashMap<String,Integer>();
    	 
    	 for(String word:words) {
    		 if(wordcount.containsKey(word)) {
    			 wordcount.put(word.toLowerCase(), wordcount.get(word)+1);
    		 }else {
    			 wordcount.put(word, 1);
    		 }
    	 }
    	 Set<String>wordInString=wordcount.keySet();
    	 for(String word:wordInString) {
    		 if(wordcount.get(word)>1) {
    			 System.out.println(word+":"+wordcount.get(word));
    		 }
    	 }
    	 
     }
}
