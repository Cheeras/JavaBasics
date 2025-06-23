package com.assignments;

public class DatatypesAssignments {

	public static void main(String[] args) {
		//1.Write a program to add two strings
		String a = "Hello";
		String b = "Naveen K";
		//Output 
		//Hello Naveen K
		System.out.println(a+" "+b);
		
		//2.Write a java program Sum of two numbers
		int num1=74;
		int num2=36;
		System.out.println(num1+num2);
		
		//3.Write a java program to print the division of 2 numbers
		int num3=50;
		int num4=0;
		
		//System.out.println(num3 !=0 ? num3/num4 : "Can not divide by zero");
		//4.Write a java program to compute the specified expression and 
		//print the output. Go to the editor.
		System.out.println((25.5*3.5)-(3.5*3.5)/(40.5-4.5));
		/* In Java, operator precedence and associativity 
		 * decide the order of execution.
		 Operators Involved:
		Operator	Description		Precedence	Associativity
		 	*		Multiplication	High		Left to right
			-		Subtraction		Medium		Left to right
			/		Division		Medium		Left to right
			()		Parentheses		Highest			-		*/
		
		//5.Try to concat "Hello Selenium" with a character 't'.
		String input = "Hello Selenium";
		System.out.println(input+'t');
		
		//6.Create 3 int variables having values like: 100,200,3400. Add them
		//and contactenate and generate this output string
		//output: Your Total amount is:3700
		
		int val1=100,val2=200,val3=3400;
		int output= val1+val2+val3;
		System.out.println("Your Total amount is:"+output);
		
		//7.Print the ASCII value of the character 'h'
		char ch = 'h';
		System.out.println(ch+0);
		System.out.println((byte)ch);
		
		//8.Write a program to add 3 to the ASCII value of the character 'd'
		//and print the equivalent character
		char ch1 = 'd';//99
		int ech = ch1+3;//103
		System.out.println(ech);
		System.out.println((char)ech);
		
		
	}

}
