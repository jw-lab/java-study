package methodOverloading;

public class Person {
	public void greet() {
		System.out.println("헬로우");
	}
	
	public void greet(String name) {
		System.out.println("헬로우"+name);
	}
}
