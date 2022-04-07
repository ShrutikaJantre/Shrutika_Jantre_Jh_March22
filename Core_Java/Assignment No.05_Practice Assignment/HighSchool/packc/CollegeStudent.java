package packc;
import packb.Student;

public class CollegeStudent extends Student{
	public int year;
	public String major;
	
	public CollegeStudent(String name, int age, String gender, int studentRollNo, int year, String major){
		super(name, age, gender, studentRollNo);
		this.year = year;
		this.major = major;
	}
	
	public void display(){
		
		CollegeStudent cs1 = new CollegeStudent("Harry Potter", 18, "Male", 1294, 1, "Communications");
		System.out.println("Name = "+getName()+ "\nAge = "+getAge()+ "\nGender = "+getGender()+ 
		"\nStudent Roll No. = "+getStudentRollNo()+ "\nYear = "+year+ "\nMajor = "+major); 
		System.out.println();
	}
	
}