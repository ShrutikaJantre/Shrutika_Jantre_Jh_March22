/* 3. Design a class that can be used by a health care professional to keep track of a patient’s vital statistics.
 Here’s what the class should do:
Construct a class called Patient
Store a String name for the patient
Store weight and height for patient as doubles
Construct a new patient using these values
Write a method called BMI which returns the patient’s BMI as a double. BMI can be calculated as BMI =
( Weight in Pounds / ( Height in inches x Height in inches ) ) x 703
Next, construct a class called Patients and create a main method. Create a Patient object and assign some height and weight to that object.
 Display the BMI of that patient. */
 
import java.util.*; 
class Patient{
	String name;
	double weight;
	double height;
	double BMI;
	
	Patient(String n, double w, double h){
		this.name = n;
		this.weight = w;
		this.height = h;	
		BMI();
	}
	
	double BMI(){
		return BMI = ( weight / ( height * height ) ) * 703;
	}
	
}

class Patients{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name = sc.next();
		System.out.println("Enter Weight in Pounds: ");
		double weight = sc.nextDouble();
		System.out.println("Height in inches: ");
		double height = sc.nextDouble();
		
		Patient p1 = new Patient(name, weight, height);
		System.out.println("Name: "+name+ "\nWeight: "+weight+ "\nWeight: "+height+ "\nBMI: "+p1.BMI);
		
	}
}