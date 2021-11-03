package lambda_example;

@FunctionalInterface
interface Runner{
	void execute();//매개변수가 없는 메소드
}

public class App2 {

	public static void main(String[] args) {
		// 람다식으로 익명클래스를 바로 구현
		// ()->{}; 형식, 매개변수가 없으므로 ()를 사용한다.
		Runner run = ()->System.out.println("헬로우!");//execute메소드 오버라이드
		run.execute();//오버라이드된 메소드를 실행
		
		System.out.println(run instanceof Runner);//true, 인터페이스의 객체이다
		System.out.println(run.getClass());
	}

}
