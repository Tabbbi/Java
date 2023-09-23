package application;

public abstract class Vehicle {
	private int seats;
	
	public Vehicle(int pSeats) {
		this.seats = pSeats;
	}
	
	public void show() {
		
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}	
}