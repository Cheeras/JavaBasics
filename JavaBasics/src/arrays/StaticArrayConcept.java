package arrays;

import java.util.Arrays;

public class StaticArrayConcept {

	public static void main(String[] args) {

		int arr[] = new int[4];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		
		System.out.println(arr);
		//print the array with out any loop
		
		System.out.println(Arrays.toString(arr));
		
		//index based for loop
		for(int i = 0;i<=arr.length-1 ;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("------------------");
		
		//for each loop
		for(int e : arr) {
			System.out.println(e);
		}
		
		System.out.println("------------------");
		//2. double array
		double d[] = new double[3];
		d[0] = 12.33;
		d[1] = 38.98;
		d[2] = 202.78;

		System.out.println(d);
		System.out.println("for each loop");
		//for each loop
		for(double e : d) {
			System.out.println(e);
		}
		//can we print double array with out for loop yes/no - yes we can
		System.out.println(Arrays.toString(d));
		
		System.out.println("------------------");
		//3.char array
		char ch[] = new char[4];
		ch[0] = 'A';
		ch[1] = 'a';
		ch[2] = '$';
		ch[3] = '0';
		
		for(char e : ch) {
			System.out.println(e);
		}
		
		System.out.println(ch);
		System.out.println(Arrays.toString(ch));
		System.out.println("------------------");
		//4.String array
		System.out.println("--------String Array----------");
		String emp[] = new String[4];
		emp[0] = "John";
		emp[1] = "chirag";
		emp[2] = "Mocha";
		emp[3] = "Latam";
		//for each loop
		for(String e : emp) {
			System.out.println(e);
			if(e.equals("Mocha")) {
			break;
			}
		}
		
		//empdata = name(String), age(int), gender(char), salary(double), isPerm(boolean)
		
		//5.Object array
		Object data[] = new Object[5];
		data[0] = "Jonny";
		data[1] = 30;
		data[2] = 'm';
		data[3] = 35.55;
		data[4] = true;
		
		System.out.println(Arrays.toString(data));
		System.out.println("------------------");
		
		//for each loop
		for(Object e : data) {
			System.out.println(e);
		}
		System.out.println("---------index based for loop---------");
		//index based for loop
		for(int i=0 ;i<=data.length-1 ; i++) {
			System.out.println(data[i]);
		}
		
		System.out.println("Print int array in reverse order");
		int r[] = new int[4];
		r[0] = 10;
		r[1] = 20;
		r[2] = 30;
		r[3] = 40;
		
		//for loop index based 
		for(int i = r.length-1 ; i >= 0 ; i--) {
			System.out.println(r[i]);
		}
		
		System.out.println("for each loop");
		
		//for each loop with reverse order - it not possible - no it is possible
		int count = r.length - 1;
		for(int e : r) {
			e = count;
			System.out.println(r[e]);
			count--;
		}
		
		//two major limitation of array
		//1. Size of the array is fixed: to overcome this we will use ArrayList(Dynamic Array) 
		//2. Homogeneous/similar type data : to over come this, we can use object array but 
		//but still it is static array
		
		//Another way of declaring the array is using array literals
		int num[] = {10,20,30,50,12,34};//if you are already aware of the data we will use array literal
		System.out.println(num.length);//6 //0-5
		System.out.println(num[0]);
		System.out.println(Arrays.toString(num));
		num[0] = 400;
		System.out.println(num[0]);//AIOB
		System.out.println(Arrays.toString(num));// we are loosing the data in static array when you are
		//trying to insert at index 0 where already data present
		//it will override the existing data and replace new data that means we are loosing the data
		int pp[] = new int[40];//if we are not sure about the full data
		
		String browser[] = {"chrome","firefox","edge"};
		System.out.println();//length 3//range is 0 1 2
		System.out.println(Arrays.toString(browser));
		browser[0]= "ie";
		for(String e : browser) {
			System.out.println(e);
		}
		System.out.println(Arrays.toString(browser));
		
		
	}

}
