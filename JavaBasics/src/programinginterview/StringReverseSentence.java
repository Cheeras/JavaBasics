package programinginterview;

public class StringReverseSentence {

	public static void main(String[] args) {
		String sentence = "Welcome to Selenium Automation";
		String revsentence = "";
		
		//Reverse the all the words of the string at the same place
		//output 
		//emocleW ot miuneleS noitamotuA
		String[] words = sentence.split(" ");

		for(int i=0 ; i <= words.length-1; i++) {
			String revWord = "";
			System.out.println(words[i]);
			for(int j = words[i].length()-1;j>=0;j--) {
				revWord = revWord + words[i].charAt(j);
			}
			revsentence =revsentence +  revWord + " ";
		}
		
	    System.out.println(sentence);
		System.out.println(revsentence);
		

	}

}
