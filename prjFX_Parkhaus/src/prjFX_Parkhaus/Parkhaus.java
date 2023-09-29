package prjFX_Parkhaus;

public class Parkhaus {
	private Car[] places;
	private int reservated;
	private int occupied = 0;
	Trafficlight trafficlight = new Trafficlight();
	
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
	
	public void trafficlight() {
		if (occupied == places.length - reservated) {
			trafficlight.setColor("red");
		} else if ((occupied >= places.length - reservated - 10) && (occupied <= places.length - reservated)) {
			trafficlight.setColor("yellow");
		} else if (occupied < places.length - reservated - 10) {
			trafficlight.setColor("green");
		}
	}
	
	public void removeCar() {
		
	}
	
	public void show() {
		System.out.println("There are " + occupied + " of " + places.length + " occcupied, with " + reservated + " reservated.");
	}
}
