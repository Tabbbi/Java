package prjFX_Parkhaus;

public class Main {
	
	public static void main(String[] args) {
		Parkhaus p1 = new Parkhaus(100, 5);
		p1.addCar(5);
		p1.addCar(6);
		p1.trafficlight();
		p1.show();

	}
}
