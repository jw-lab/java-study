package equals;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 =new Person("펭수");
		Person p2 =new Person("펭수");
		
		System.out.println(p1 == p2); //객체의 주소 비교 =>false
		System.out.println(p1.toString().equals(p2.toString()));//String클래스의 equals =>true
		System.out.println(p1.equals(p2));// equals메소드를 다시 작성하여 이름값으로 비교
	}

}
