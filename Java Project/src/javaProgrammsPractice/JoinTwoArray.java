package javaProgrammsPractice;

import java.util.Arrays;
import java.util.stream.Stream;

public class JoinTwoArray {

	public static void main(String[] args) {
		String str1[]= {"java","deshmuk","test","manual","manchu"};
		String str2[]= {"swathi","renuka","anusha","harshitha","manual"};
       Stream<String>st1=Arrays.stream(str1);
       Stream<String> st2=Arrays.stream(str2);
       String FullTeam[]=Stream.concat(st1, st2).toArray(size->new String[size]);
       for(String s:FullTeam) {
    	   System.out.println(s);
       }
	}

}
 