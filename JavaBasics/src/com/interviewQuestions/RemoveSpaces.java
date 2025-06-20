package com.interviewQuestions;

public class RemoveSpaces {

    public static void main(String[] args) {
        String input = " Hello\tWorld \nJava ";
        StringBuilder result = new StringBuilder();

        // Loop through each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Append if not whitespace
            if (!Character.isWhitespace(ch)) {
                result.append(ch);
            }
        }

        System.out.println("Original: \"" + input + "\"");
        System.out.println("Without spaces: \"" + result.toString() + "\"");
    }
}
