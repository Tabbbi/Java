package prj_Personal_Manegement;

public class Student extends Person implements Interface1{

	private int grade;
	
	public Student() {
		super();
		this.grade = 0;
	}
	
	public Student(String pFirstName, String pLastName, int pAge, int pId, int pGrade) {
		super(pFirstName, pLastName, pAge, pId);
		this.grade = pGrade;
	}
	
	public void show() {
		System.out.println("Student: " + getId());
		System.out.println("Name: " + getLastName() + ", " + getfirstName());
		System.out.println("Grade: " + getGrade());
		System.out.println("Age: " + getAge());
	}
	
	//Getters and Setters
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
}
