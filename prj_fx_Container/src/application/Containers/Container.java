package application.Containers;

public abstract class Container {

	private double length;
	private double height;
	private double width;

	public Container(double pLength, double pHeight, double pWidth) {
		this.length = pLength;
		this.height = pHeight;
		this.width = pWidth;
	}

	public void showContainer() {
		System.out.println("*********************************************************************");
		System.out.println("Length: " + this.length + " Width: " + this.width + " Height: " + this.height);
	}
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
}
