package programinginterview;

public class Stringpalindrom {

	public static void main(String[] args) {
		String str = "LiriLR";
		boolean isPalindrom = false;
		isPalindrom = checkPalidrom(str);
		if(isPalindrom) {
			System.out.println(str + " Given number is palindrom");
		}else {
			System.out.println(str + " Given number is not palindrom");
		}

	}
	
	public static boolean checkPalidrom(String input) {
		
		if(input == null || input.isEmpty()) {
			return false;
		}
		int lenghtOfString = input.length();
		int start = 0;
		int end = lenghtOfString - 1;
		
		while(start < end) {
		if(input.charAt(start) != input.charAt(end)) {
			return false;
		}
		start ++;
		end --;	
		}
		return true;
	}

}
