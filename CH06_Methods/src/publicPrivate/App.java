package publicPrivate;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.setName("펭");
		p1.setAge(7);
		
//		p1.name = "길동";
		
		System.out.println(p1.getName());

		System.out.println(p1.getAge());
	}

}
