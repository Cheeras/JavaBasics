package functionsinjava;

public class Customer {
	
	//Write a function 
	//Creteria or requirement
	//create a function: this will return the customer mark on the basis of given customer name
	//return marks(int)
	//Which is good returning return each if block would be good compared to storing the marks variable return
	public int getCustomerMarks(String name) {
		System.out.println("customer name is "+name);
		int marks = -1;
		if(name.trim().equalsIgnoreCase("shankar")) {
			marks = 90;
			//return 90;
		} else if(name.trim().equalsIgnoreCase("Piyush")) {
			marks = 95;
			//return 95;
		} else if(name.trim().equalsIgnoreCase("ravi")) {
			marks = 10;
			//return 10;
		} else {
			System.out.println("Please pass the correct customer name "+ name);
		}
		return marks;
	}
	
	//main method
	public static void main(String [] args) {
		
		Customer c = new Customer();
		int marks = c.getCustomerMarks("pIYUSH ");
		System.out.println(marks);
		int marks1 = c.getCustomerMarks("pooja");
		System.out.println(marks1);
		
	}

}
