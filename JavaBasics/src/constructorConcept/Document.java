package constructorConcept;

public class Document {

	
	String content;
	//In your class if you are writing any Constructor(1 paramter, 2 parameter) constructor 
	//Compiler will not any hidden(default Constructor) 
	//Compiler will only only add default constructor if user does not provide any constructors(1 par,2 par ...ect)
	//If user added any constructor other than default constructor it is recommended to write default constructor
	public Document(String content) {
		this.content = content;
	}
	public static void main(String[] args) {
		
		Document d = new Document("Hello How are you");//compile time error // default constructor is undefined

	}

}
