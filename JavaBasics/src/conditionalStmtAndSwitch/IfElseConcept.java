package conditionalStmtAndSwitch;

public class IfElseConcept {

	public static void main(String[] args) {
//		//break;// break is eligile to write only in Switch case for loop, while loop , do while loop 
		// basically in all loops 
		// we can not write the break statement inside if block
		//1 == Operator means comparison here 
		System.out.println(10==20);
		int a = 10;
		int b = 20;
		//if(expression should always result boolean either true or false)
		if(a>b) {
			System.out.println("a is greater than b");
		}else {
			System.out.println("b is greater than a");
		}
		if(false) {
			System.out.println("Hello");
		}//dead code if the condition false by default control will not come inside
		//then this code is dead code
		else {//else part is dead code if(true)
			System.out.println("Bye");
		}
		
		boolean flag = false;
		if(flag) {
			System.out.println("Hi");
		}else {
			System.out.println("byeee");
		}
		boolean isHeadLess = true;
		if(isHeadLess) {
			System.out.println("run tc is headless");
		}else {
			System.out.println("run tc is normal mode");
		}
		
		if(10>5) {
			System.out.println("shankar");
		}
		//nested if conditions if -- if -- else --if
		int marks =90;//GRADE-A
		//97 //GRADE-A//100% schoolar ship
		//101//INVALID MARKS
		
		if(marks<=100) {
			if(marks>=90) {
				System.out.println("GRADE-A");
				if(marks>=95) {
					System.out.println("100% schoolar ship");
				}if(marks==100) {
					System.out.println("0% tution fee");
				}
			}
		}else {
			System.out.println("INVALID MARKS");
		}
		//if -  if -  if - else
//		String browser = "chrome";
//		if(browser.equals("chrome")) {
//			System.out.println("Chrome is launched");
			//break;// break is eligile to write only in Switch case for loop, while loop , do while loop 
			// basically in all loops 
			// we can not write the break statement inside if block
//		}
//		if(browser.equals("firefox")) {
//			System.out.println("firefox is launched");
//		}
//		if(browser.equals("edge")) {
//			System.out.println("edge is launched");
//		}
//		if(browser.equals("ie")) {
//			System.out.println("ie is launched");
//		}else {//this else is associated with last if
//			System.out.println("Please pass the right browser "+browser);
//		}
		/*
		 * 
		 * In the above multiple if logic although first if matches still the control 
		 * will check the remaining all the if
		 * 
		 * Consider for example browser name "chrome" 
		 * control will check first if it matches then control will go inside if block and 
		 * execute the statement
		 * Here it will print "Chrome is launched"
		 * then it will check second if condition i.e is browser equal to firefox no 
		 * then it will check third if condition i.e is browser is equal to edge no
		 * then it will check fourth if condition i.e is browser is equal to ie no
		 * then it will execute the else block becuase last if statement is not executed
		 * it is will print "Please pass the right browser chrome"
		 * 
		 * don't you think this is worst way of writing if condition  
		 * all though my condition is satisfied at first if still it is executing all the if 
		 * if the last if not matched it will execute the else block
		 * 
		 * what if we have 100 combinations if it mataches 99th combination unnecessary we will all 1 to 98 
		 * combinations which is not good right
		 * which is performance issue
		 * 
		 * This is worst way of writing the logic
		 * 
		 * */
		//if -  if -  if - else
		String browser = "opera";
		if(browser.equals("chrome")) {
			System.out.println("Chrome is launched");
		}
		else if(browser.equals("firefox")) {
			System.out.println("firefox is launched");
		}
		else if(browser.equals("edge")) {
			System.out.println("edge is launched");
		}
		else if(browser.equals("ie")) {
			System.out.println("ie is launched");
		}else {//this else is associated with last if
			System.out.println("Please pass the right browser "+browser);
		}
		
	}

}
