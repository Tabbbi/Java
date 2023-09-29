package prjFX_Parkhaus;

public class Parkhaus {
	private Car[] places;
	private int reservated;
	private int occupied = 0;
	Trafficlight trafficlight;
	
	public Parkhaus(int pPlaces, int pReservated) {
		this.places = new Car[pPlaces];
		this.reservated = pReservated;
	}
	
	public void addCar(int pPlace) {
		int index = pPlace + 1;
		if (places[index] != null) {
			System.out.println(pPlace + " is already occupied!");
		} else {
			places[index] = new Car();
			occupied++;
		}
	}
	
	public void trafficLight() {
		if (occupied >= places.length - reservated) {
			trafficlight.setColor("red");
		}
	}
	
	public void removeCar() {
		
	}
	
	public void show() {
		System.out.println("There are " + occupied + " of " + places.length + " occcupied, with " + reservated + " reservated.");
	}
}
