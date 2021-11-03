package lambda_example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class App {

	public static void main(String[] args) {
		
		List<String> list =new ArrayList<>();
		
		list.add("하나");
		list.add("둘");
		list.add("셋");
		
		//리스트의 forEach메소드의 매개변수는 Consumer인터페이스 객체이다.
		//인터페이스로는 객체를 만들수 없기 때문에 익명클래스를 만들고 그 안에 추상메소드를 완성하면 된다.
		list.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				// Consumer 인터페이스의 추상메소드 (구현을 해야한다)
				System.out.print(t);
				System.out.print(" ");
			}
		});
		
		System.out.println();
		
		//람다, 매개변수가 1개이므로 () 생략가능, 코드가 1줄이면 {} 생략가능
		// 익명클래스로 구현하는 메소드의 (매개변수)->{실행코드}
		list.forEach(t->{
			System.out.print(t);
			System.out.print(" ");
		});

	}

}
