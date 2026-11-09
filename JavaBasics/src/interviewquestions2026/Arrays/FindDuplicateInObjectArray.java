package interviewquestions2026;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateInObjectArray {

	public static void main(String [] args) {
		Object arr[] = {10,"shankar",9,"Cheerala",10,"Suresh",33,"Cheerala",29,10};
		
		Map<Object,Integer> map = new HashMap<Object,Integer>();
		
		for(Object obj : arr) {
			map.put(obj,map.getOrDefault(obj, 0)+1);
		}
		
		System.out.println("Duplicate elements");
		for(Map.Entry<Object,Integer> entry : map.entrySet()) {
			if(entry.getValue() > 1 ) {
				System.out.println(entry.getKey() +"---->"+ entry.getValue());
			}
		}
	}
}
