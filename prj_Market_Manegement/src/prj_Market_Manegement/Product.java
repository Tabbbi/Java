package prj_Market_Manegement;

public abstract class Product {
	private int id;
	private int size;
	private double weight;
	private double price;
	private String name;
	
	public Product(int pId, int pSize, double pWeight, double pPrice, String pName) {
		this.id = pId;
		this.size = pSize;
		this.weight = pWeight;
		this.price = pPrice;
		this.name = pName;
	}
	
	// Getters & Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
