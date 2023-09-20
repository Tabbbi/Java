package prj_laschen1;

public class Test2 {

	public static void main(String[] args) {

		int all = 20;
		
		for (int i = 0; i < all; i++) {
			for (int j = 0; j < all; j++) {
				if (i == 2 || i == (all - 3)) {					
					System.out.print("*");
				} else if ( j == 2 || j == (all - 3)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}	
}