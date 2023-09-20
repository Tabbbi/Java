package prj_Box;

public class Main {

	public static void main(String[] args) {
		int x = 5;
		int y = 7;
		int z = 9;
		double dia = (z*(Math.sqrt(2)/2));
		int kath = (int) (dia*(Math.sqrt(2)/2));
		int x_length = x + kath;
		int y_length = y + kath;
		System.out.println(kath);
		System.out.println(dia);
		
			for (int i = 0; i < y_length; i++) {
				for (int j = 0; j < x_length; j++) {
					if ((i == 0 && j >= kath) || (i == (y_length - 1) && j < x)) {
						System.out.print("*");
					} else if ((j == 0 && i >= kath) || (j == (x_length - 1) && i < y)) {
						System.out.print("*");
					} else if (j == (x - 1) && i >= kath) {
						System.out.print("*");
					} else if (i == kath && j < x) {
						System.out.print("*");
					} else if (j == (-i) + kath) {
						System.out.print("/");
					} else if ((j == (-i) + (kath + (x - 1))) && i < kath) {
						System.out.print("/");
					} else if (j == (-i) + (kath + x + y - 1)) {
						System.out.print("/");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			
			System.out.println();
			
			for (int i = 0; i < y_length; i++) {
				for (int j = 0; j < x_length; j++) {
					 if ((i == 0 && j <= (x - 1)) || (i == (y - 1) && (j <= (x - 1)))) {
						 System.out.print("*");
					 } else {
						 System.out.print(" ");
					 }
				}
				System.out.println();
			}
		}
	}
