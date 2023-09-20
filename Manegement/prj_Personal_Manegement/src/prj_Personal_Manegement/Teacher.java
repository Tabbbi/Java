package prj_Personal_Manegement;

public class Teacher extends Person implements Interface1 {
	
	private int salary;
	
	public Teacher(String pName, String pLastName, int pAge, int pId, int pSalary) {
		super(pName, pLastName, pAge, pId);
		this.salary = pSalary;
	}
	
	public void show() {
		System.out.println("Teacher: " + getId());
		System.out.println("Name: " + getLastName() + ", " + getfirstName());
		System.out.println("Age: " + getAge() + " Years");
		System.out.println("Salary: " + getSalary() + "€");
	}

	
	
	
	// Getters & Setters
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
