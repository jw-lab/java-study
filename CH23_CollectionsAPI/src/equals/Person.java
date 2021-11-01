package equals;

public class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public boolean equals(Object other) {

		if(other == null) return false; //널값이면 false
		if(other == this) return true; //같은 객체면 true
		if(!(other instanceof Person)) return false; // 같은 타입이 아니면 false
		if(this.name == null) return false; //this객체의 이름값이 널이면 false
		Person p =(Person) other;
		if(p.name == null) return false; // other객체의 이름값이 널이면 false
		
		return this.name.equals(p.name); //this객체의 이름값과 other객체의 이름값 비교
	}

}
