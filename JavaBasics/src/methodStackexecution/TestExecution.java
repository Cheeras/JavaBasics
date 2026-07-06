package methodStackexecution;

public class TestExecution {

	//a method is calling itself - is called recursion
	public void getNum() {
		System.out.println("Number");
		getNum();
	}
	
	
	public static void main(String[] args) {
		TestExecution obj = new TestExecution();
		obj.getNum();
	}

}
