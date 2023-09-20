package prj_Container_Management;

public abstract class Container {
	private double height;
	private double length;
	private double width;
	private String type;

	public Container(double pHeight, double pLength, double pWidth, String pType) {
		this.height = pHeight;
		this.length = pLength;
		this.width = pWidth;
		this.type = pType;
	}

	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
