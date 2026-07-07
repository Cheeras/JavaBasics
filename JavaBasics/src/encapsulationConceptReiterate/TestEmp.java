package encapsulationConceptReiterate;

public class TestEmp {

	public static void main(String[] args) {
		
		//Create - POST
		Employee e1 = new Employee("Priya", 30, 25, true);
		
		//Retrieval - getMethod - GET
		System.out.println(e1.getName()+" "+e1.getAge()+" "+e1.getSalary()+" "+e1.isPerm());
		
		//Update -- PUT
		e1.setAge(31);
		e1.setSalary(30.5);
		
		//Retrieval - getMethod - GET
		System.out.println(e1.getName()+" "+e1.getAge()+" "+e1.getSalary()+" "+e1.isPerm());
		
		//Create - POST
		Employee e2 = new Employee("Veena", 25, 22.34, false);
		
		//Retrieval - getMethod - GET
		System.out.println(e2.getName()+" "+e2.getAge()+" "+e2.getSalary()+" "+e2.isPerm());
		
		//Update -- PUT
		e2.setPerm(true);
		
		//Retrieval - getMethod - GET
		System.out.println(e2.getName()+" "+e2.getAge()+" "+e2.getSalary()+" "+e2.isPerm());
		
		Broswer b = new Broswer();
		b.launchBroswer();
		
		//login
		//creating first time user
		//this is POST Call 
		LoginPage l = new LoginPage("shankar@gmail.com","shankar@123");
//		l.setUsername("test@gmail.com");
//		l.setPassword("test@123");
		System.out.println(l.getUsername() + " " + l.getPassword() );
		l.doLogin();
		l.setPassword("shankar@9949");
		System.out.println(l.getUsername() + " " + l.getPassword() );
		
		//login with other user
		LoginPage lp1 = new LoginPage("Piyush@gmail.com", "Piyush@123");
		lp1.doLogin();
		
	}

}
