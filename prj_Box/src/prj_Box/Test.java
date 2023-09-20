package prj_Box;

public class Test {
	private double length;
	private double width;
	private double heigth;
	
	public void show3d() {
		System.out.println("");
		// 3d Top
		for (int j = 0; j < realheigth(); j++) {
			System.out.print("");
			for (int i = 0; i < (realheigth() - j - 1); i++) {
				System.out.print(" ");
			}
			System.out.print("*");
			if (j == 0)
				for (int i = 0; i <= (getwidth() - 3); i++) {
					System.out.print("*");
				}
			else {
				for (int i = 0; i <= getwidth() - 3; i++) {
				System.out.print(" ");
				}
			}
			System.out.println("*");
		}
		
			// square
			for (int i = 0; i < getlength(); i++) {
				for (double j = 0; j < getwidth(); j++) {
					if (i == 0 || i == (getlength() - 1)) {
						System.out.print("*");
					} else if ( j == 0 || j == (getwidth() - 1)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
					// 3d right side
					if (j == getwidth() - 1) {
						for (j = getwidth() - 1; j <= getwidth() + realheigth() - 3; j++) {
							System.out.print("+");
							
							if (j == (getwidth() + realheigth() - 2)) {
								System.out.print("*");
							}
							
						}
					}
				}
				System.out.println();
			}
		}

	// show square
	public void show() {
		for (int i = 0; i < getlength(); i++) {
			for (int j = 0; j < getwidth(); j++) {
				if (i == 0 || i == (getlength() - 1)) {
					System.out.print("*");
				} else if ( j == 0 || j == (getwidth() - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public void setlength(int i) {
		this.length = i;
	}
	public void setwidth(int i) {
		this.width = i;
	}
	public void setheigth(int i) {
		this.heigth = i;
	}	
	public double getlength() {
		return length;
	}
	public double getwidth() {
		return width;
	}
	public double getheigth() {
		return heigth;
	}
	public double realheigth() {
		double realheigth = getheigth() * (Math.sqrt(2) / 2);
		return realheigth;
	}
}