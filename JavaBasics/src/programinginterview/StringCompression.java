package programinginterview;

import java.util.HashMap;
import java.util.Map;

public class StringCompression {

	public static void main(String[] args) {
		String input = "aabcaccaaa";
		//a2b1c5a3
		//a5b1c5
		String compressed = compress(input);
		System.out.println(compressed);
	}
	
	public static String compress(String str) {
		
		
		//return nothing if the string is empty or null
		if( str == null || str.isEmpty()) {
			return str;
		}
		
		char[] charArray = str.toCharArray();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(char ch : charArray) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			}else {
				map.put(ch, 1);
			}
		}
		
		String result = "";
		for(Map.Entry<Character, Integer> entry: map.entrySet()) {
			result = result + entry.getKey() + entry.getValue();
		}
		return result;
	}

}
