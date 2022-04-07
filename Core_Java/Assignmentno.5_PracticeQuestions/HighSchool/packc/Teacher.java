package packc;
import packb.Person;

public class Teacher extends Person{
	
	private double salary;
	public String subject;
	
	public Teacher(String name, int age, String gender, double salary, String subject){
		super(name, age, gender);
		this.salary = salary;
		this.subject = subject;
	}	
		
	public double getSalary(){
		return this.salary;
	}
		
	public void setSalary(double salary){
		this.salary = salary;
	}
	
	public void display(){
		
		System.out.println("Name = "+getName()+ "\nAge = "+getAge()+ "\nGender = "+getGender()+
		"\nSalary = "+getSalary()+ "\nSubject taught: "+subject); 
		System.out.println();
	}
}