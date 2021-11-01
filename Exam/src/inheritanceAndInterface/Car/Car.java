package inheritanceAndInterface.Car;

public class Car {
	protected String name;

	public Car(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "[자동차] {name:" + name + "}";
	}
	
	
}
