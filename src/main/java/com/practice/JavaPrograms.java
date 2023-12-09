package com.practice;

public class JavaPrograms {
	public static void main(String[] args) {
		//System.out.println(isPalindrome("bab"));
		String str1 = "Rama";
		String str2 = "Rama";
		String str3 = new String("Rama");

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str1==str2);
		System.out.println(str1==str3);


	}
	
	public static boolean isPalindrome(String str) {
		String reverse = "";
		for(int i=0;i<str.length();i++) {
			reverse = str.charAt(i)+reverse;
		}
		if(reverse.equalsIgnoreCase(str)) {
			return true;
		}
		System.out.println(reverse);
		return false;
		
		
	}

}
