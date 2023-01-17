package PracticeJava;

import java.util.Scanner;

public class PalidromeString {

	public static void main(String[] args) {
		System.out.println("enter given string:");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String orig_str=str;
		String rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
			if(orig_str.equals(rev)) {
				System.out.println("palindrome string:"+orig_str);
			}else {
				System.out.println(" Not a palindrome string:"+orig_str);
			}
			
		
		

	}

}
