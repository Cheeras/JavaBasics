package encapsulationConcept;

public class LoginPage {

	//this is also example of the encapsulation
	//Hiding the data members through the private and accessing/modifying with public layer
	
	//Why we need to make the data members private
	//we have control over what values we are accepting
	//Prevents bugs and bad data
	
	//What are benefits of the Making data members private
	/*1.Data protection and security 
	 *	Prevents unauthorized access to sensitive data(ex: password,Salary)
	 * 	private String password:
	 *2.Validation Before Assignment
	 *	we can validate the data inside setter method
	 *	Helps to prevent invalid,null and corrupt data
	 *	public void setAge(int age){
	 *		if( age > =0){
	 *		System.out.println("Valid age");
	 *		}else {
	 *		System.out.println("InValid age");
	 *		}
	 *	}
	 *3.Controlled Access with Getters/Setters
	 *	You decide:
	 *		If a value is read-only (only getter).
	 *		If a value is write-only (only setter).
	 *		If a value is editable with restrictions.
	 *			
	 *			public int getBalance() {
    				return this.balance; // read-only
				}
	 *4.Easier Maintenance and Refactoring
	 *	You can change the internal logic or variable type later with out breaking the other code
	 *	private BigDecimal salary;
	 *5.Better Debugging and Logging
	 *	You can add logs,events and conditions when a value is changed or read
	 * 	public void setScore(int score) {
    		System.out.println("Score is being updated...");
    		this.score = score;
		}
	 * 
	 *6.Encapsulation Leads to Reusability
	 *  Encapsulated objects are modular and reusable in multiple parts of a program.
	 * 		Student student = new Student();
	 * 		student.setName("Ravi"); // safe to reuse
	 * 7. 🧱 Supports Immutable Design
	 * 		Make fields private final and don’t provide setters → object becomes read-only.
	 * 			public class Constants {
    				private final String VERSION = "1.0";

    			public String getVersion() {
        			return VERSION;
    				}
				}

	 * Summary Table:
	 * ---------------------------------------------------------------------------
	 * | Benefit                     | Why It Matters                            |
	   | --------------------------- | ----------------------------------------- |
       | 🔒 Security                 | Prevent misuse or hacking                 |
       | ✅ Validation               | Prevent invalid input                     |
       | 🔄 Controlled Access        | Decide how and when values can be changed |
       | 🧪 Debugging & Logging      | Trace and log value changes               |
       | 🔧 Easy Refactoring         | Safe to change internals without impact   |
       | ♻️ Reusability & Modularity | Object behaves like a self-contained unit |
       | 🔁 Supports Immutability    | Helps create read-only objects            |
	   ---------------------------------------------------------------------------
	 * 
	 * */
	
	private String userName;
	private String passWord;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	

}
