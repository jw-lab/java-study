package multi_inheritance;

public class App {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.greet();
		p1.speak();
		
		Speaker p2 = new Person();
		p2.speak();
	
		Greeter p3 = new Person();
		p3.greet();
	}

}
