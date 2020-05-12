package StudentPackage;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	private double grade;
	
	public Person() {
		firstName = "Unknown";
		lastName = "Unknown";
		age = 0;
		grade = (double) 00.0;
	}
	
	public Person(String fName, String lName, int age, double grade) {
		this.firstName = fName;
		this.lastName = lName;
		this.age= age;
		this.grade = grade;
	}
	
	public void displayPerson() {
		System.out.println("---------------\n"
				+ "Last Name: " + lastName + "\n" 
				+ "First Name:" + firstName + "\n"
				+ "Age: " + age + "\n"
				+ "Grade: " + grade);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getStudentID() {
		return studentID;
	}

	public void setStudentID(long studentID) {
		this.studentID = studentID;
	}

	public float getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	
	
}
