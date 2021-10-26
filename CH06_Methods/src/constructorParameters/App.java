package constructorParameters;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		Person p2 = new Person("펭수",120.0);
		Person p3 = new Person("길동",172.5);
		Person p4 = new Person("라이언",165.5);
		
		System.out.println(p1.getName());
		System.out.println(p1.getHeight());
		System.out.println(p2.getName());
		System.out.println(p2.getHeight());
		System.out.println(p3.getName());
		System.out.println(p3.getHeight());
		
		System.out.println(p1.toString());

		System.out.println(p2.toString());

		System.out.println(p3.toString());
		
	}

}
