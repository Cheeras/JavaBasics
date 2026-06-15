package com.interviewQuestions.Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractingIntegerFromString {

	public static void main(String[] args) {

		String str = "Your Trascation ID:89778 and Your Reference Number is:009889";
		
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher(str);
		
		while(m.find()) {
			System.out.println(m.group());
		}
				
		
		
	}

}
