package instanceOf;

import java.io.Serializable;

public class App {

	public static void main(String[] args) {
		// 객체의 타입을 판별한다
		Creature c1 = new Creature(); //크리쳐 클래스는 시리얼인터페이스 구현,디폴트 id를 만들었음
		Object c2 = c1; //Object는 최상위 클래스 타입으로 어느 클래스 타입에도 선언가능
		
		Cat c3 = new Cat();//Cat클래스는 크리쳐 클래스를 상속해서 디폴트 id를 생성했음
		
		Serializable c4 =(Serializable) c3;
		
		//c1은 크리쳐 클래스의 객체이다. 시리얼 인터페이스를 구현, 오브젝트 클래스의 자식
		System.out.println(c1 instanceof Object); //true
		System.out.println(c1 instanceof Serializable);//true
		System.out.println(c1 instanceof Creature);//true
		System.out.println(c1 instanceof Cat);//false
	}

}
