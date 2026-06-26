package conditionalStmtAndSwitch;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		/**
		 * browser is firefox it will directly go to firefox case and execute 
		 * it control will not check other case statement
		 * that is how the switch case is designed in java or other programing laungages
		 * java script,python
		 * 
		 * Limitation of Switch case
		 *  If do't put the break 
		 *  it will execute all the cases including the default case as well
		 * 
		 * 
		 * **/
		//break;// break is eligible to write only in Switch case for loop, while loop , do while loop 
		// basically in all loops 
		// we can not write the break statement inside if block
		//*******we can achieve cross browser logic in selenium frame work*******
		//Duplicate names are not allowed
		String browser = "ie";
		switch (browser.trim().toLowerCase()) {
		case "chrome":
			System.out.println("launch chrome");
			//break;//come out of the entire switch case 
			//will go and check firefox and ie 
			//no it won't check 
		case "firefox":
			System.out.println("launch firefox");
			//break;
		case "edge":
			System.out.println("launch edge");
			//break;
		case "ie":
			System.out.println("launch ie");
			break;
		default:
			System.out.println("please pass the right browser "+browser);
			break;
		case "opera":
			System.out.println("launch opera");
			break;
		}
		
		int marks = 100;
		switch(marks) {
		case 99:
			System.out.println("99");
			break;
		case 98:
			System.out.println("98");
			break;
		default:
			System.out.println("please pass the int range");
			break;
		}
		//switch case are allowed only
		//byte,short,int,char,String
		//switch case not allowed for
		//long,float and double - NA
		byte b = 1;
		switch(b) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		case 4:
			System.out.println("4");
			break;
		default:
			System.out.println("please pass the byte range");
			break;
		}
		
	}
	//Real time use cases of Switch cases
	//1. cross browser logic
	//2. cross OS Logic
	//3. month
	//4. user permission
	//5. testcases in different environment dev,qa,uat,stage, prod
	//6. time zones
	//7. uber: cases: sedan, mini, suv, prime
	//8. HR : user roles 
	//9. Localization testing : lang in english, franch,arabic
	//10. Product category: Electronics,Fashion,makeup
	

}
