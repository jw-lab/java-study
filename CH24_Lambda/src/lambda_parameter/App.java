package lambda_parameter;

interface Runner{
	void execute(String text);
}

public class App {

	public static void main(String[] args) {
		// 1. 함수형 인터페이스(메소드가 1개) 일 때 사용가능
		// 2. 추상메소드의 리턴타입과 매개변수를 확인하고 생성한다.
		Runner run1 = (t)->System.out.println(t);
		run1.execute("펭수");
		
		Runner run2 = s->System.out.println(s);
		run2.execute("길동");
	}

}
