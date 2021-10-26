package static_innerClass;

public class App {

	public static void main(String[] args) {
		Person p1 =new Person();
		p1.print();
		//이너클래스 (객체를 만들때도 먼저 외부클래스 객체를 만들어야 만들수 있다)
		Person.Head head = p1.new Head();//사용 하는 방법정도만 알면 된다. 거의 사용x
		head.print();
		
		//스태틱 이너 클래스 --사용안함...
		Person.Body body = new Person.Body();
		body.print();
	}

}
