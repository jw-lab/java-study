package java_api.sales;

public class Menu {
	private String name; //메뉴명
	private int price;	 //가격
	private int count;	 //하루 판매량
	
	public Menu(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
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

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Menu [name=" + name + ", price=" + price + ", count=" + count + "]";
	}
	
	
}
