package com.basics;

public class StringContainingOvewls {

	public static void main(String[] args) {

		String str = "str";
		System.out.println(stringContainsVowels(str));
	}

	public static boolean stringContainsVowels(String str) {
		return str.matches(".*[aeiouAEIOU].*");
	}
}
