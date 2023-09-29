package prj_WeatherstationTest;

public class Main {

	public static void main(String[] args) {
		int[] weather = { 12, 14, 9, 12, 15, 16, 16, 15, 15, 11, 8, 13, 13, 15, 12 };

		int avTemp = 0;
		for (int i = 0; i < weather.length; i++) {
			avTemp += weather[i];
		}
		avTemp = avTemp / (weather.length);
		
		System.out.println("The average Temperature was at " + avTemp + " °C.");
	}
}
