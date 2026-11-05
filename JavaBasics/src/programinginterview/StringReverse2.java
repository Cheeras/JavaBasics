package programinginterview;

public class StringReverse2 {

	public static void main(String args[]) {
		String str = "Computer Science";
		// Output is ecneicS retupmoC
		String rev = "";
		if (str == null || str.isEmpty()) {
			System.out.println("String is empty or null, Please provide the valid string");
			return;
		}

		for (int i = str.length() - 1; i >= 0; i--) {
			if (i == 0 || i == str.length() - 1) {
				continue;
			} 
				rev += str.charAt(i);
		}

		System.out.println("Original String is -> " + str);
		System.out.println("Reversed String is -> " + rev);
	}
}
