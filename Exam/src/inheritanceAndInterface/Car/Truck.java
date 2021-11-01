package inheritanceAndInterface.Car;

public class Truck extends Car {
	private double ton;//적재량

	public Truck(String name, double ton) {
		super(name);
		this.ton = ton;
	}

	@Override
	public String toString() {
		return "[트럭] {name:" + name +", ton:"+ton+ "}";
	}
	
	
	
}
