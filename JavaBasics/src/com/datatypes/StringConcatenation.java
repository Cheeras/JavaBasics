package com.datatypes;

public class StringConcatenation {

	public static void main(String[] args) {

		//String is class from java - non primitive 
		String name = "shankar";
		String num = "1000";
		
		String x = "Welcome";
		String y = "Selenium";
		
		int a = 100;
		int b = 200;
		
		double c = 14.23;
		double d = 14.33;
		
		System.out.println(a+b);//here + is arthimatic opertor because a and b are integer
		System.out.println(x+y);//here + concatenation operator
		System.out.println(x+a);//Welcome100
		System.out.println(a+b+x);//300Welcome
		System.out.println(x+y+a+b);//WelcomeSelenium100200
		System.out.println(a+b+x+y+a+b);//300WelcomeSelenium100200
		System.out.println(x+y+(a+b));//WelcomeSelenium300
		System.out.println(a+b+x+y+a+b+c+d);//300WelcomeSelenium10020014.2314.33
		System.out.println(a+b+x+y+(a+b+c+d));//300WelcomeSelenium328.56
		
		System.out.println(a+b+c+d+x+y);//328.56WelcomeSelenium
		
		System.out.println("the value of a "+a);//the value of a 100
		System.out.println("the value of b "+b);//the value of b 200
		System.out.println("the sum of a and b is :"+(a+b));
		
		char ch = 'a';
		String str = "Selenium";
		System.out.println(str + ch);//Seleniuma
		//If you concatenation with String then it will become String
		
		
		//range
		//a-z : 97-122
		//A-Z : 65-90
		//0-9 : 48-57
		char c1 = 'a';//97
		char c2 = 'b';//98
		System.out.println(c1);//a
		System.out.println(c1+c2);//195// it will not give ab 
		System.out.println(c1-c2);//-1
		
		System.out.println('A' + 'B');//65+66//131
		System.out.println(c1+c2+'0'+'A');//97+98+48+65//308
		System.out.println(str+c1+c2);//Seleniumab
		System.out.println(str+(c1+c2));//Selenium195
		//where ever adding 2 charcters java will take their ASCII values
		//Give me ASCII value of a is 
		System.out.println((byte)c1);
		//Give me ASCII value of $
		System.out.println((byte)'$');
		//Give me ASCII value of '*'
		char ct = '*';
		System.out.println((byte)ct);
		//why are converting to byte because ASSII value is not
		//more than 127 which is byte range
		System.out.println('a'+0);//97//another way of printing ASCII Value
		System.out.println('$'+0);//36//another way of printing ASCII value
		
		System.out.println('a'+10+20-10);//97+10+20-10//117
		
		System.out.println("Shankar " + 'c' );
		System.out.println('a'+'c'+'0'+'9'+'A'+"Hello"+'a'+'b');//97+99+48+57+Hello9798//366Hello9798
		
		boolean flag = true;
		String u = "yes";
		System.out.println(flag + u);//trueyes
		
		System.out.println("a"+"b");//ab
		
		System.out.println('a'+'b');//195
		
		System.out.println(flag +""+'a');//truea
		/**
		 * In every programming language all the characters are defined by specific ASCII numbers
		 * it is universal table, it's not like for java the table will different for 
		 * other programming language the table will be different
		 * 
		 * When ever you perform any arithmetic or mathematical operations on character it will
		 * always consider their ASCII values
		 * 
		 * ASCII value of small a is 97
		 * ASCII value of small b is 98
		 * 
		 * ASCII value of small z is 122
		 * 
		 * ASCII value of Capital A is 65
		 * ASCII Value of Capital B is 66
		 * 
		 * ASCII value of Capital Z is 90
		 * */
		
	}
}
