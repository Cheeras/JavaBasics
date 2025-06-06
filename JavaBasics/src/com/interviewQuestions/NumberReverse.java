package com.interviewQuestions;

public class NumberReverse {

	public static void main(String[] args) {
		
		/*int number = 12345;
		//output 2543
		int output=0;
		
		if(number==0) {
			System.out.println("Number should be non zero ");
			return;
		}
		
		while(number>0) {
			int digit = number%10; // this will give reminder
			output = (output*10) + digit;
			number = number/10;
		}*/
		
		//System.out.println(output);
	/*	| Line                                | What it Does                                     |
		| ----------------------------------- | ------------------------------------------------ |
		| `int digit = number % 10;`          | Extracts the **last digit** (e.g., 5 from 12345) |
		| `reversed = reversed * 10 + digit;` | Builds the new number from right to left         |
		| `number = number / 10;`             | Removes the last digit (e.g., 12345 → 1234)      |
	 */
		
		//Make sure that it should cover all the negative number
		//-1200 to -21
		//0 to 0
		/*
		 * ✅ All edge and negative cases:
		   ✅ Negative numbers (e.g., -123 → -321)
           ✅ Trailing zeros (e.g., 1200 → 21)
           ✅ Zero input (0 → 0)
           ✅ Large/small integers within int range
          */
		
		int num = 123456789;
		int reversed = reverseNumber(num);
		System.out.println(reversed);
	}
	
	public static int reverseNumber(int num) {
		int reversed = 0;
		int sign = num < 0 ? -1 : 1;
	
		num = Math.abs(num);//to get the absolute number
		
		while(num!=0){
			int digit = num%10;
			
			if(reversed > (Integer.MAX_VALUE-digit)/10) {
				System.out.println("Over flow occured ");
				return 0;
			}
		
			reversed = reversed*10 + digit;
			num = num/10;
		}
		return reversed*sign;
		}

}
