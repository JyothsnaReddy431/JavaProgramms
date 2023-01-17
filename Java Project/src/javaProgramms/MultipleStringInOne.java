package javaProgramms;

import java.util.StringJoiner;

public class MultipleStringInOne {

	public static void main(String[] args) {
		// [Lisa,Tom,Jyothsna]
		
	StringJoiner joiner=new StringJoiner(","," [","]")	;
		
		joiner.add("Lisa")
		        .add("Tom")
		     .add("Jyothsna");
		System.out.println(joiner.toString());
	}

}
