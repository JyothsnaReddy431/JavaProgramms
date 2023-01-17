package PracticeJava;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		String names[]= {"java","c++","test","data","java","data","manual","c++"};
		
		Set<String> store=new HashSet<String>();
		for(String name:names) {
			if(store.add(name)==false) {
				System.out.println("Duplicate Elemets in array:"+name);
				
			}
		}
		
	}

}
