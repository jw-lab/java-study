package example;

@FunctionalInterface
interface Greeter{
	void greet(); //추상메소드
}

public class App2 {
	public static void main(String[] args) {
		
		Greeter g = ()-> System.out.println("헬로우~");
		
		g.greet();
		
		//위의 람다식을 메소드 레퍼런스로 변경
		Greeter g1 = App2::sayHello;
		g1.greet();
	}

	//메소드 레퍼런스로 람다식 대체하기 위해 메소드를 만든다
	private static void sayHello() {
		System.out.println("헬로우~");
	}
}
