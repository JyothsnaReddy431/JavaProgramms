package javaProgramms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInString {

	public static void main(String[] args) {
	String 	inputstring="hey java is best language is best java";
	Duplicatewordsinstring(inputstring);
	}
public static void Duplicatewordsinstring(String inputstring) {
	String words[]=inputstring.split(" ");
	Map<String,Integer> wordcount=new HashMap<String,Integer>();
	for(String word:words) {
		if(wordcount.containsKey(word)) {
			wordcount.put(word.toLowerCase(), wordcount.get(word)+1);
		}else {
			wordcount.put(word, 1);
		}
	}
		Set<String> wordsInstring=wordcount.keySet();
		for(String word:wordsInstring){
			if(wordcount.get(word)>1) {
				System.out.println(word+":"+wordcount.get(word));
			}
		}
		
		
		}

	
	
	
	
}
