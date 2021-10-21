package interfaces;

public class App {

	public static void main(String[] args) {
		
		Describable[] objs = new Describable[2];
		
		objs[0] = new Person();
		objs[1] = new Computer();
		
		for(Describable obj : objs) {
			System.out.println(obj.getDescription());
		}
	}

}
