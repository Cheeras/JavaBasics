package functionsinjava;

public class StudentMarksSheet {

	//Write a function
	//return marks(int)
	//0 - 100
	//student not found: return -1
	public int getStudentMarks(String name) {
		System.out.println("Student name :"+name);
		switch(name.trim().toLowerCase()) {
		case "shankar":
			return 90;
		case "Priya":
			return 95;
		case "Naveen":
			return 80;
		default:
			System.out.println("please pass the right student name "+name);
			return -1;
			
		}
	}
	public static void main(String[] args) {

		StudentMarksSheet sh = new StudentMarksSheet();
		int m = sh.getStudentMarks("Pradeep");
		System.out.println(m);
		if(m>0) {
			System.out.println("Print the marks sheet");
		}
		
	}

}
