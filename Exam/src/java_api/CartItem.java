package java_api;

public class CartItem {
	private String name;
	private int price;
	
	
//	public CartItem() {
//		this("",0);
//	}
	
	public CartItem(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
