package prj_Personal_Manegement;

public class Administration {

	public static void main(String[] args) {
		Student s1 = new Student("Tabea", "Laschen", 17, 1, 12);
		Teacher t1 = new Teacher("Tobias", "Gloor", 42, 10001, 5000);
		s1.show();
		t1.show();
		
	}

}
// Student: Name, LastName, Age, Id, Grade
// Teacher: Name, LastName, Age, Id, Salary