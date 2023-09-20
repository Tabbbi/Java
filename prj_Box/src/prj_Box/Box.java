package prj_Box;

public class Box {

	public static void main(String[] args) {
		Test b1 = new Test();
		b1.setlength(7);
		b1.setwidth(15);
		b1.setheigth(5);
		System.out.println("Length: " + b1.getlength());
		System.out.println("Width: " + b1.getwidth());
		System.out.println("Heigth: " + b1.getheigth());
		b1.show3d();
	}
}
