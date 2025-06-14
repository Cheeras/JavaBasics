package com.interviewQuestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOfCharacters {
	
	public static void main(String[] args) {
		String str = "Hello world";
		
		Map<Character,Integer> freeMap = new LinkedHashMap<Character,Integer>();
		for(char ch : str.toCharArray()) {
			if(ch == ' ') continue;
			freeMap.put(ch, freeMap.getOrDefault(ch,0)+1);
		}
		
		//Display the character frequency 
		for(Map.Entry<Character,Integer> entry : freeMap.entrySet()) {
			System.out.println("'"+ entry.getKey()+ "':"+entry.getValue());
		}
	}

}
