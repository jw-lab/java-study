package lambda_interface;

import java.util.function.Predicate;

public class App {

	public static void main(String[] args) {
		// 특정 타입(제네릭)을 검사해서(test) boolean 참,거짓으로 리턴한다.
		// Predicate은 Type T 인자를 받고 boolean을 리턴하는 함수형 인터페이스
		Predicate<String> p1 = new Predicate<String>() {
			
			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				return t.length() < 4 ;
			}
		};
		
		System.out.println(p1.test("abcd"));//길이가 4 --false
		System.out.println(p1.test("하나둘"));//길이 < 4 -- true

		//람다식으로 간단하게 표현, return을 생략하고 바로 적을 수 있다.
		Predicate<String> p2 = t->t.length()<4;
		
		System.out.println(p2.test("one"));//true
		System.out.println(p2.test("three"));//false
	}

}
