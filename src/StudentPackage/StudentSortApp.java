package StudentPackage;

public class StudentSortApp {

	public static void main(String[] args) {
		
		int stdSize = 100;
		ArrayInStudent arr = new ArrayInStudent(stdSize);
		
		arr.insert("Jack", "Vo", 21, 86.00);
		arr.insert("Chuong", "Vu", 29, 99.00);
		arr.insert("Smith", "Doc", 59, 67.55);
		arr.insert("Evans", "Pat", 20, 85.5);
		arr.insert("Stimson", "Henry", 27, 89.88);
		arr.insert("Vang", "Jose", 28, 86.90);
		arr.insert("Creswell", "Lucinda", 23, 95.00);
		arr.insert("Yee", "Tom", 24, 100.00);
		
		System.out.println("Before sort: ");
		arr.display();
		
		arr.insertSort();
		System.out.println("After Sort: ");
		arr.display();

	}

}
