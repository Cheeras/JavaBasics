package com.interviewQuestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringCompression {

	public static void main(String[] args) {

		String input = "aabcccccaaa";
		//a2b1c5a3
		String compressed = compress(input);
		System.out.println(compressed);
	}
	
	public static String compress(String str) {
		
		if(str == null || str.isEmpty()) return str;
		
		Map<Character,Integer> map = new LinkedHashMap<>();
		for(char ch : str.toCharArray()) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
			
		}
		String result="";
		for(Map.Entry<Character,Integer> entry : map.entrySet()) {
			result = result + entry.getKey() + entry.getValue();
		}
		
		return result;
	}

}
