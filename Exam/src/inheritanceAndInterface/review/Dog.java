package inheritanceAndInterface.review;

public class Dog implements Sounding{

	@Override
	public void sound() {
		System.out.println("Dog: 멍멍!");
	}

}
