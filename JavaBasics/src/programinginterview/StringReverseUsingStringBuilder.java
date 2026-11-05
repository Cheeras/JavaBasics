package programinginterview;

public class StringReverseUsingStringBuilder {

	public static void main(String[] args) {
		String str = "Automation";
		int stringlen = str.length();
		
		if(str == null || str.isEmpty()) {
			System.out.println("String is empty or null, Please provide valid string");
			return;
		}
		StringBuilder rev = new StringBuilder();
		for(int i = stringlen-1 ; i>=0;i--) {
			rev.append(str.charAt(i));
		}
		System.out.println(rev);
	}
}
