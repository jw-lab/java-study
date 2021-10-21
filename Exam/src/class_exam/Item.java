package class_exam;

public class Item {
	private String name;
	private int power;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	@Override
	public String toString() {
		return "Item [name=" + name + ", power=" + power + "]";
	}
	
}
