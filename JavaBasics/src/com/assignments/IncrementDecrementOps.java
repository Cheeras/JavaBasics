package com.assignments;

public class IncrementDecrementOps {

	public static void main(String[] args) {

		//1.What will be the output of the following program
		int i =11;
		i = i++ + ++i;
		System.out.println(i);
		
		//2.Guess the output of the following program?
		
		int a=11,b=22,c;
		c = a + b + a++ + b++ + ++a + ++b;
		System.out.println(c);
		
		//3.What will be the output of the below program
		int j = 0;
		j = j++ - --j + ++j - j--;
		System.out.println(j);
		
		//4.Is the below program written correctly?
		boolean b1 = true;
		//b1++;//Type mismatch: cannot convert from boolean to int
		System.out.println(b);
		
		//5.What will be the output of the below program
		
		int k=1,l=2,o=3;
		int m = k-- - l-- - o--;
		System.out.println("k="+k);
		System.out.println("l="+l);
		System.out.println("o="+o);
		System.out.println("m="+m);
		
		//6.What will be output of the following program
		
		int d =1,e =2;
		System.out.println(--e - ++d + ++e - --d);
		
		//7.What will be the values of i,j and k in the below program?
		
		int p=19,q=29,r=0;
		int s = p-- - q-- - r--;
		System.out.println("p="+p);
		System.out.println("q="+q);
		System.out.println("r="+r);
		
		//8.What is wrong with the below program? why it is showing compilation
		//error?
		
		int t =11;
		//int u = --(t++);// we can apply increment/decrement on variables only 
		//not the values
		
		//9.Guess the value of p in the below program
		int u = 0,v=0;
		int w = --u * --v * u-- * v--;
		System.out.println(w);
		
		//10.what will be the output of the following program?
		int x = 1;
		x = x++ + ++x * --x - x--;
		System.out.println(x);
		
		//11. what will be the output of the below program
		//int a1 = 11++;//increment/decrement can not apply on numbers
		//System.out.println(a1);
		
		//12.What will be the output of the below program?
		int ch3 = 'A';
		System.out.println(ch3++);
		//preincrement

		//13.What will be the output of the below program?
		int ch4 = 'A';
		System.out.println(++ch4);
		
		//14.What will be the output of the below program?
		double d4 = 1.5,DD=3.5;
		System.out.println(d4++ + ++DD);
		
		//15.
	}

}
