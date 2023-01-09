package javaProgrammsPractice;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter given String:");
		String str=sc.next();
		String orig_str=str;
		String rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}

		if(orig_str.equals(rev)) {
			System.out.println(orig_str+ ":palidrome string");
			
		}else {
			System.out.println(orig_str+ " :Not a palidrome string");
		}
	}

}
