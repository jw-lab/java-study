package default_Constructor;

public class Person {
	private String name;
	private int age;
	
	public Person() {
		System.out.println("����Ʈ ������");
		name = "��";
		age = 0;
	}
	
	public Person(String name) {
		System.out.println("person ������1");
		this.name = name;
		age=0;
	}
	
	
	public Person(String name, int age) {
		System.out.println("person ������2");
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	
	
	
}
