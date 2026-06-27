package loops;

public class Forloop {

	public static void main(String[] args) {

		//for loop
		//print 1 to 10
		
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
	/**
	 * Syntax
	 * 
	 * 
	 * for(initilization;condition check;increment/decrement){
	 * java statement
	 * }
	 * 
	 * */	
		System.out.println("--------------");
		for(short i =1;i<=10;i++) {
			System.out.println(i);
		}
		System.out.println("--------------");
		
		for(char ch = 'a';ch<='z';ch++) {
			System.out.println(ch +"="+(byte)ch);
		}
		System.out.println("--------------");
		char ch = 'A';
		int a = ch;
		System.out.println(a);
		
		//what is difference between for loop and while loop - Yes
		//can i use character with while loop - Yes
		//can i use double with while loop - Yes
		//can i use short with while loop - Yes
		
		//above same we can do with for loop as well 
		//then what is difference between while loop and for loop
		
		//Any good example of double in loop
		//Build number
		
		
		//Question is when to use while loop and when to use for loop
		//can i write break in for loop and while loop yes we can write break
		//break means come out of for loop not if condition
		
		//When to use while loop
		//when number iterations are not fixed then use while loop
		//when we don't have any idea that how many iterations then we will use while loop
		//Any good example for this in real time
		
		//selecting date on calender - Calender handling
		//Infinite scrolling on facebook
		//Infinite scrolling on Linked In
		//Wait for element on the page
		//Wait for page loading
		//web table with pagination
		//carosal
		
		//When to user for loop
		//when number of iterations are fixed, then user for loop
		//month drop down : 1 to 12
		//Arrays, ArrayList: for loop
		//footer link
		//drop down with fixed data
		//movie tickets - bookmyshow.com - 120 seats
		//flight tickets
		//bus tickets
		
//		for(;;) {//infinite loop //when you don't mention any thing in the condition 
//			//it will be true
//			System.out.println("Welcome to hotel TAJ");
//		}
		int ss = 10;
		while(true) {
			System.out.println("Welcome to Hotel TAJ");
		}
		
		
		
		
		
		
		
		
		
	}

}
