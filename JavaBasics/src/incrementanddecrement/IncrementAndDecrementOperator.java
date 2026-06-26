package incrementanddecrement;

public class IncrementAndDecrementOperator {

	public static void main(String[] args) {
//		//++ increase by 1
//		//-- decrease by 1
//		
//		//1. post increment 
//		// first give the value of a to b
//		// then increment value of a by 1
//		int a = 1;
//		int b = a++;//++ i have applied after a then it is called a // post increment
//		System.out.println(b);//1
//		System.out.println(a);//2
//		
//		int c = -97;
//		int d = c++;
//		
//		System.out.println(c);//-96
//		System.out.println(d);//-97
//		
//		//2.Pre increment
//		//first increment value by 1
//		//then assign the value
//		int e = 1;
//		int f = ++e;
//		System.out.println(e);//2
//		System.out.println(f);//2
//		
//		int r = -100;
//		int t = ++r;
//		System.out.println(r);//-99
//		System.out.println(t);//-99
//
//		int h = -48;
//		int l = ++h;
//		System.out.println(h);
//		System.out.println(l);
//		
//		
//		//3.Post decrement
//		// first give the value of m to n
//		// then decrement value of m by 1
//		int m = 2;
//		int n = m--;
//		System.out.println(m);
//		System.out.println(n);
//		
//		int total = 10;
//		System.out.println(total++);//10
//		System.out.println(total);//11
//		
//		int fee = 100;
//		System.out.println(fee--);//100
//		System.out.println(fee);//99
//		
//		//4.Pre decrement
//		//first decrement value by 1
//		//then assign the value
//		int v = 2;
//		int g = --v;
//		System.out.println(v);//1
//		System.out.println(g);//1
//
//		int num = 10;
//		System.out.println(--num);//9
//		System.out.println(num);//9
		
//		//Little complex examples
//		int i = 11;
//		int j = i++ + ++i;
//		System.out.println(i);
//		System.out.println(j);
		
		/*
		 * Explanation:
		 * In case of post increment first it will consume original value of i and then increment i 
		 * by 1 in memory 
		 * In Case of Post increment in the expression it will take original value and then increment
		 * by 1 in memory
		 * */
		
//		int a = 11, b =22, c;
//		c = a + b + a++ + b++ + ++a + ++b;
//		System.out.println("a="+a);
//		System.out.println("b="+b);
//		System.out.println("c="+c);
//		
//		int i = 0;
//		int j = i++ + --i + ++i - i--;
//		System.out.println("i="+i);//0
//		System.out.println("j="+j);//0
//		
//		int m1 = 0, n1=0;
//		int p1 = --m1 * --n1 * n1-- * n1--;
//		System.out.println("m="+m1);
//		System.out.println("n="+n1);
//		System.out.println("p="+p1);
//		
//		
		int a = 1;
		int b = a++ + ++a * --a - a--;
		System.out.println(a);
		System.out.println(b);
		
		//int a1 = 11++;//invalid // we can not apply increment and decrement on integers we 
		//we can apply only on variables
		//System.out.println(a1);
		
		int ch = 'A';//65
		System.out.println(ch++);//65
		System.out.println(ch);
		
		double d = 1.2;
		System.out.println(++d);
		System.out.println(d);
		
		char c = 'a';//a
		System.out.println(c++);
		System.out.println(c);
		
		char v ='b';
		System.out.println(v++);//b
		System.out.println(v);//c
		
		System.out.println((byte)v);
		
		char ch1 = 'z';//122
	    System.out.println(++ch1);//123
	    
	    int s = 1000;
	    System.out.println((char)s);
	}

}
