package functionsinjava;

public class Broswer {

	// for click do you really want to return
	// click on where you should pass some thing
	public void click(String element) {
		System.out.println("click on the element " + element);
	}

	// for sendKeys() give me some Webelment and entering the
	// value to the element
	public void sendKeys(String element, String value) {
		System.out.println("entering the value "+value+ "into the element "+element);
	}
	
	//WAF -- supply broswer name
	//chrome, firefox,safari or edge 
	//return print the success message return boolean(true/false)
	//lunchingBroswer
	public boolean launchBroswer(String browserName) {
		System.out.println("Broswer name is "+browserName);
		boolean flag = true;
		switch(browserName.trim().toLowerCase()) {
		case "chrome":
			System.out.println("Launch google chrome");
			break;
		case "firefox":
			System.out.println("Launch firefox");
			break;
		case "edge":
			System.out.println("launch edge");
			break;
		case "opera":
			System.out.println("Launch opera");
			break;
		default:
			System.out.println("Plesae pass the right browser name "+browserName);
			flag = false;
			break;
		}
		//where should i write return out side of switch 
		return flag;
	}
	
//	public void getNumber(int a) {
//		System.out.println("getNumber int parameter");
//	}
//	
//	public void getNumber(char a) {
//		System.out.println("getNumber char parameter");
//	}
	
	public void getNumber(byte a) {
		System.out.println("getNumber byte parameter");
	}
	
	public void getNumber(short a) {
		System.out.println("getNumber short parameter");
	}
	
//	public void getNumber(long a) {
//		System.out.println("getNumber long parameter");
//	}
	
	public void getNumber(double a) {
		System.out.println("getNumber double parameter");
	}
	
	public void getNumber(float a) {
		System.out.println("getNumber float parameter");
	}
	
	
	public static void main(String[] args) {
		
		Broswer b = new Broswer();
		boolean exe = b.launchBroswer("ie");
		System.out.println(exe);
		if(exe) {
			System.out.println("Please enter the url");
		}
		b.getNumber(99);//default it will call int 
		b.getNumber((byte)77);
		b.getNumber(100.0f);
		b.getNumber('a');

	}

}
