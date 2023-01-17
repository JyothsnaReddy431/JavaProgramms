package PracticeJava;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		String str1="marry";
		String str2="arrmy";
		char []arry1=str1.toLowerCase().toCharArray();
		char[]arry2=str2.toLowerCase().toCharArray();
		Arrays.sort(arry1);
		Arrays.sort(arry2);
		if(Arrays.equals(arry1, arry2)) {
			System.out.println("anagram");
		}else {
		System.out.println("not a anagram");
		}
	}

}
