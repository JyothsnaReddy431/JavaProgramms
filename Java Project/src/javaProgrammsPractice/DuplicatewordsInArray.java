package javaProgrammsPractice;

import java.util.HashSet;
import java.util.Set;

public class DuplicatewordsInArray {

	public static void main(String[] args) {
		
		String names[]= {"java","c++","microsoft","Test","data","java","c++"};
		Set<String> store=new HashSet<String>();
		for(String name:names) {
			if(store.add(name)==false) {
				System.out.println(name);
			}
		}
		
		

	}

}
