package com.datatypes;

public class DataTypesConcept {
	/**
	 * 1.byte
	 * size: 1 byte = 8 bits in memory (RAM) 
	 * range: -128 to 127
	 * Best example of byte is age
	 * another example is month
	 * 
	 * 
	 * */

	public static void main(String[] args) {

		//data types:
		//1. premitive data types:int,char,float,String,double
		//Numeric Type:
			//Integral Value
					//int
					//byte,short,int,long
			//floating-type: float,doudle
			//character char: $ 1 a - why char is part of numeric we will discuss tomorrow
		//Boolean type: boolean(true/false)
		
		//2. non premitive data types: class,interface,arrays,Object
		//1.byte
		//size:1 byte = 8 bits
		//range:-128 to 127
		//Best example is age 
		//months

		byte b =10;
		 b =20;
		System.out.println(b);
		byte c = 100;// java will give warning for unused variables
		byte b1 = -20;
		System.out.println(b1);
		
		//2. short
		//Size : 2 bytes = 2X8 = 16 bits
		//range: -32768 to 32767
		//these are predefined ranges we can not change these 
		//in any programing language these ranges present based on that language specific
		short sh = 600;
		short bh = 122;
		System.out.println(sh);
		System.out.println(bh);
		short gh = 1;// 2 bytes 
		short h =500;
		//don't you think can we use byte for storing of 1
		//for high range we have to take high data byte for 
		//low range we need to take low data type
		
		
		//3. int
		//size: 4 bytes = 4X8 = 32 bits
		//range: -214748468 to 214748467
		//-2^31 to 2^32
		int i =1000;
		int j = 1;//4 bytes
		
		System.out.println(i);
		System.out.println(j);
		//4. long
		//size: 8 bytes = 8*8 =64 bits
		//ranage: -2^63 to 2^63-1
		long l =1;//1000*8 = 8000 bytes
		System.out.println(l);
		
		long l1 = 198891999889l;// at the end either small 'l' or capital 'L'
		System.out.println(l1);
		long dist = 98888877888L;
		System.out.println(dist);
		
		/*
		 * Any good example of the long population of india 
		 * distance between earth and moon
		 * 
		 * */
		
		//mobile, ssn, aadhar card, account number right data type is 
		//String not int,float becuase we can not perform any opration on mobile number,ssn
		
		//4.float
		//decimal values means point values
		//size 4 byte = 4*8 =32
		//Range: after . it can take upto 6 to 7 digits
		// for float before . decimal we can accomadate upto 39 digits
		// in case of double it will be 309 digits
		float n1 = 9.3f;
		float n2 = (float)23.52;
		System.out.println(n1);
		System.out.println(n2);
		
		float n3=100;
		System.out.println(n3);
		
		//5.double
		//decimal value means point values
		//size: 8 bytes = 8*8 =64 bites
		//Range:after  . it can take 15 decimal digits
		//Any Practical example Medical reaserch
		//value of PI
		double d = 12.3343;// 8 bytes
		double df = 125;
		System.out.println(d);
		System.out.println(df);
		
		
		//6.char: it can take only only 1 digit value
		//size 2 byte = 2*8 = 16 bites
		//range:
		//why 2 bytes just to store 1 single digit value
		//because of the unique code values and ASCCII values we can store in character 
		//that's why we need 2 bytes 
		//Any good example of the character Gender M,F
		
		char ch = 'a';
		System.out.println(ch);
		char ch1 = '1';
		System.out.println(ch1);
		char ch2 = '$';
		System.out.println(ch2);
		System.out.println('t');
		System.out.println('t'+10);
		
		//7. boolean
		// true or false
		// size: 1 bit 
		// range: true or flase
		boolean bll = true;
		System.out.println(bll);

	}
}
