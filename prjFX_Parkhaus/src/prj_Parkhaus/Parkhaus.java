package prj_Parkhaus;

public class Parkhaus {
	private Car[] places;
	private int reserved;
	private int occupied = 0;
	Trafficlight trafficlight = new Trafficlight();

	public Parkhaus(int pPlaces, int pReserved) {
		this.places = new Car[pPlaces];
		this.reserved = pReserved;
	}

	public void addCar(int pPlace) {
		if (occupied + 1 <= places.length - 1) {
			int index = pPlace - 1;
			if (places[index] != null) {
				System.out.println("Spot " + pPlace + " is already occupied!");
			} else {
				places[index] = new Car();
				occupied++;
			}			
		} else {
			System.out.println("There is no space left!");
		}
	}

	public void addCars(int pAmount) {
		if (occupied + pAmount <= places.length - 1) {
			for (int i = 1; i <= pAmount; i++) {
				for (int j = 0; j <= places.length - 1; j++) {
					if (places[j] == null) {
						places[j] = new Car();
					}
				}
				occupied++;
			}
		} else {
			System.out.println("There are only " + (places.length - reserved - occupied) + " spaces left!");
		}
	}

	public void removeCar(int pPlace) {
		if (places[pPlace - 1] != null) {
			places[pPlace - 1] = null;
			occupied--;			
		} else {
			System.out.println("There is no Car parked at Spot Number " + pPlace + ".");
		}
	}
	
	public void removeCars(int pAmount) {
		if (occupied - pAmount >= 0) {
			for (int i = 1; i <= pAmount; i++) {
				for (int j = 0; j <= places.length - 1; j++) {
					if (places[j] != null) {
						places[j] = null;
					}
				}
				occupied--;
			}			
		} else {
			System.out.println("There are only " + occupied + " Cars parked.");
		}
	}
	
	public void trafficlight() {
		if (occupied == places.length - reserved) { // 95
			trafficlight.setColor("red");
		} else if ((occupied >= places.length - reserved - 10) && (occupied < places.length - reserved)) { // 85 - 94
			trafficlight.setColor("yellow");
		} else if (occupied < places.length - reserved - 10) { // 85
			trafficlight.setColor("green");
		}
	}

	public void show() {
		System.out.println("There are " + occupied + " of " + places.length + " occcupied and " + reserved
				+ " spots are already reservated.");
	}
}