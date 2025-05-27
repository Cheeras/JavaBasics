package com.basics;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		
		//cross browser logic in UI automation
		//String broswer = "naveen";//String is allowed
		
		/*switch (broswer) {
		case "chrome":
			System.out.println("Chrome is launched");
			break;
		case "FF":
			System.out.println("FF is launched");
			break;
		case "edge":
			System.out.println("edge is launched");
			break;
		case "ie":
			System.out.println("IE is launched");
			break;
		default:
			System.out.println("Please provide valid broswer name "+broswer);
			break;
		
		case "opera":
			System.out.println("Opera is launched");
			break;
		}*/
		
		/*can i write switch case with integer*/
	  /*	int marks = 100;//int is allowed
		
		switch(marks) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 100:
			System.out.println("100");
			break;	
		default:
			System.out.println("not in range");
			break;
		}*/
		
		//Inside switch statement 
		// byte,short,int,char - allowed
		// String - Allowed
		//float,long,double - are not allowed
		char ch = 'h';//char is allowed
		switch(ch) {
		
		case 'a':
			System.out.println("a is vowel");
			break;
		case 'e':
			System.out.println("e is vowel");
			break;
		case 'i':
			System.out.println("i is vowel");
			break;
		case 'o':
			System.out.println("o is vowel");
			break;
		case 'u':
			System.out.println("u is vowel");
			break;
		default:
			System.out.println(ch+ " is a consonant");
		}
		
	}

}
