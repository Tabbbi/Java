package prj_Personal_Manegement;

public abstract class Person {

	private String firstName;
	private String lastName;
	private int age;
	private int id;
	
	public Person() {
		this.firstName = "John";
		this.lastName = "Doe";
		this.age = -5;
		this.id = 000;
	}
	
	public Person(String pfirstName, String pLastName, int pAge, int pId) {
		this.firstName = pfirstName;
		this.lastName = pLastName;
		this.age = pAge;
		this.id = pId;
	}
	

	// Getters and Setters
	public String getfirstName() {
		return firstName;
	}
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setAdress(String adress) {
		this.lastName = adress;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
