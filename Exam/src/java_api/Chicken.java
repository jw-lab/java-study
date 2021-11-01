package java_api;

public class Chicken {
	private String name;
	private int price;
	
	public Chicken() {
		this("",0);
	}

	public Chicken(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
