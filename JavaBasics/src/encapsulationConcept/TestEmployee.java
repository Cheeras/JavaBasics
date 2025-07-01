package encapsulationConcept;

public class TestEmployee {

	public static void main(String[] args) {

//		Employee obj = new Employee();
//		
//		obj.setName("shankar");
//		obj.setAge(30);
//		obj.setSalary(25);
//		obj.setPerm(true);
		
		//setter is helping to update the data
        //after 1 year pooja salary increased to 27 after 1 year
		
		//Create - POST
		Employee obj = new Employee("Priya",30,25,true);
		//Retrieve - GET
		System.out.println("name : "+obj.getName()+", Age: "+obj.getAge()+", Salary: "+obj.getSalary()+", isPermanent: "+obj.isPerm());
		
		//Update - PUT
		obj.setSalary(27);
		obj.setAge(31);
		
		//Create - POST - another employee
		Employee obj2 = new Employee("Veena",20,12,false);
		
		//Retrieve - GET
		System.out.println("name : "+obj2.getName()+", Age: "+obj2.getAge()+", Salary: "+obj2.getSalary()+", isPermanent: "+obj2.isPerm());
		
		//Update - PUT
		obj2.setAge(21);
		obj2.setSalary(15);
		obj2.setPerm(true);
		System.out.println("name : "+obj2.getName()+", Age: "+obj2.getAge()+", Salary: "+obj2.getSalary()+", isPermanent: "+obj2.isPerm());
		
		
	}

}
