package javaProgramms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWordsInArray {

	public static void main(String[] args) {
		
		String names[]= {"java","c++","c","java","maven","test","c"};
		Set<String> store=new HashSet<String>();
		for(String name:names) {
			if(store.add(name)==false) {
				System.out.println("Duplicate values:"+name);
			}
			
		}
		
		
		
		
		
		
		

	}

}
