package application;

public class Cat {
	private String name;// 인스턴스 변수는 객체를 생성해야 사용가능
	public static final String FOOD = "고양이 사료";
	//스태틱은 객체와 상관없이 클래스명.변수 로 사용한다. 객체 생성 필요x, 이미 만들어져 있다.
	//스태틱 변수는 객체에서 공유가능
	private static int count=0;
	private int id;
	
	public Cat(String name) {
		this.name = name;
		count++;
		id=count;
	}
	@Override
	public String toString() {
		return String.format("Cat id: %d, name: %s", id,name);
	}
	
	public static int getCount() {
		return count;
	}
	public void setCount(int count) {
		Cat.count = count;
	}
	
	
}
