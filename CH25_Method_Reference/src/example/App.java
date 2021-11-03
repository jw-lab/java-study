package example;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {

	public static void greet() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		// 메소드 레퍼런스로 람다식 대체

		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
		
		//람다식으로 구현
		service.scheduleAtFixedRate(()->System.out.println("헬로우"), 0, 1000, TimeUnit.MILLISECONDS);
		
		//메소드 레퍼런스로 대체 -- 메소드를 따로 만들어서 사용
		//메소드 레퍼런스 문법 --> 클래스이름::메소드이름(매개변수나 괄호는 안씀)
		service.scheduleAtFixedRate(App::greet, 0, 1000, TimeUnit.MILLISECONDS);
	}

}
