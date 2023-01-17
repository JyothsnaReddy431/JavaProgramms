package javaProgramms;
import java.util.ArrayList;
import java.util.Collections;

public class HighestElemntInArrayList {
		 
 public static void main(String[] args) {
		    
		 
		        // ArrayList of Numbers
	ArrayList<Integer> myList = new ArrayList<Integer>();
		 
		        // adding elements to Java ArrayList
		        myList.add(16);
		        myList.add(26);
		        myList.add(3);
		        myList.add(52);
		        myList.add(70);
		        myList.add(12);
		 
		        // 'min' method is used to find the
		        // minimum elementfrom Collections Class
		        System.out.println("Maximum Element in ArrayList = "
		                           + Collections.max(myList));
		    }
		
	}


