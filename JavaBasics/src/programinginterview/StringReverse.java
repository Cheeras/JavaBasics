package programinginterview;

public class StringReverse {

	public static void main(String[] args) {
		String str = "Selenium";
		int stringlen = str.length();
		String rev = "";
		if(str == null || str.isEmpty()) {
			System.out.println("String is empty or null, Please provide valid string");
			return;
		}
		for(int i = stringlen-1; i >=0;i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
	}
}
