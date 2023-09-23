package application;

public class Truck extends Vehicle {
	private int loading;
	public Truck(int pSeats, int pLoading) {
		super(pSeats);
		this.loading = pLoading;
	}
	
	
	public int getLoading() {
		return loading;
	}
	public void setLoading(int loading) {
		this.loading = loading;
	}
}
