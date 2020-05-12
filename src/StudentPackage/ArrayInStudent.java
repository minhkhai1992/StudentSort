package StudentPackage;

public class ArrayInStudent {

	private Person[] a;			// Create a object to store student in array
	private int element;		// Index position element.
	
	public ArrayInStudent(int max) {
		a = new Person[max];
		element = 0;
	}
	
	public void insert(String fName, String lName, int age, double d) {
		a[element] = new Person(fName,lName, age, d);
		element++;													// Increasement size
	}
	
	public void display() {
		System.out.println("Student information");
		for(int k=0; k < element; k++) {
			a[k].displayPerson();
		}
		System.out.println("");
	}
	/*
	 * The method will sort by Student last name
	 * @param: no paramater input.
	 * 
	 */
	public void insertSort() {
		int in, out;
		
		for(out = 1; out < element; out++) {
			Person temp = a[out];
			in = out;
			while(in > 0 && a[in - 1].getLastName().compareTo(temp.getLastName()) > 0) {
				a[in] = a[in - 1];
				--in;
			}
			a[in] = temp;
		}
		
		
	}
	
	
	
	
}
