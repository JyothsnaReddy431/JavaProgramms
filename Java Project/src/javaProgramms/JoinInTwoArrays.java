package javaProgramms;

import java.util.Arrays;
import java.util.stream.Stream;

public class JoinInTwoArrays {

	public static void main(String[] args) {
		
		String []batman= {"sachin","jyothi","malii","kiran","test","prema"};
		String[]bowlers= {"asha","jyothsna","manisha","premajyothi","madah","kinger"};
		
	Stream<String>sbat	 = Arrays.stream(batman);
	Stream<String>sbow  =Arrays.stream(bowlers);
	
	String fullteam[]=Stream.concat(sbat, sbow).toArray(size-> new String[size]);
			
	for(String s:fullteam) {
		System.out.println(s);
	}
		
		
		
		
		
		
		
		
	}

}
