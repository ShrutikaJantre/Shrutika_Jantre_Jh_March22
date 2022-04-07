package packa;
import packb.Person;
import packb.Student;
import packc.CollegeStudent;
import packc.Teacher;

class HighSchool{
	public static void main(String[] args){
		
		System.out.println("Person's Information:");
		Person p1 = new Person("Khoa Nyugen", 27, "Male");
		p1.display();
		
		System.out.println("Student's Information:");
		Student s1= new Student("Ron Weasly", 16, "Male", 1234);
		s1.display();
		
		System.out.println("Teacher's Information:");
		Teacher t1 = new Teacher("Severus Snape", 34, "Male", 50000, "Computer Science");
		t1.display();
		
		System.out.println("College Student's Information:");
		CollegeStudent cs1 = new CollegeStudent("Harry Potter", 18, "Male", 1294, 1, "Communications");
		cs1.display();
		
		p1.setName("Keren Nyugen");
		p1.setGender("Female");
		System.out.println("Name = "+p1.getName()+ "\nAge = "+p1.getAge()+ "\nGender = "+p1.getGender());
		System.out.println();
		
		t1.setName("Minerva McGonagall");
		t1.setAge(55);
		t1.setGender("Female");
		t1.display();
	}
}