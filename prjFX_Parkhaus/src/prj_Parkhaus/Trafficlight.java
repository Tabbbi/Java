package prj_Parkhaus;

public class Trafficlight {
	
	public void setColor(String pColor) {
		if (pColor == "green") {
			System.out.println("Trafficlight is green.");
		} else if (pColor.equals("yellow")) {
			System.out.println("Trafficlight is yellow.");
		} else if (pColor.equals("red")) {
			System.out.println("Trafficlight is red.");
		}
	}
}
