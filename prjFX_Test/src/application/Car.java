package application;

public class Car extends Vehicle{
	private int doors;
	
	public Car(int pSeats, int pDoors) {
		super(pSeats);
		this.doors = pDoors;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}
}
