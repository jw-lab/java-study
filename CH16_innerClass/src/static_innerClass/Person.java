package static_innerClass;

public class Person {
	class Head {//내부 클래스 Head
		public void print() {
			System.out.println("헤드");
		}
	}
	
	static class Body{//스태틱 내부 클래스 Body
		public void print() {
			System.out.println("바디");
		}
	}
	
	public void print() {//클래스 Person의 메소드
		Head head = new Head();
		Body body = new Body();
		
		head.print();
		body.print();
	}
}
