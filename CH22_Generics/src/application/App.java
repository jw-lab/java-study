package application;

import java.util.Iterator;

import collections.Wrapper;
import hierarchy.Cat;
import hierarchy.Creature;
import hierarchy.Mammal;

public class App {

	public static void main(String[] args) {
		//제네릭 타입 클래스는 객체를 만들때 타입을 지정한다.
		Wrapper<Cat> wrapper = new Wrapper<>(); //포장 클래스의 객체를 만듬
		Wrapper<Creature> wrapper2 = new Wrapper<>();
		Wrapper<Mammal> wrapper3 = new Wrapper<>();
		
		Cat cat = new Cat("마틸다"); // 고양이 마틸다 객체를 생성
		Creature creature = new Creature("생물");
		Mammal mammal = new Mammal("포유류");
		
 		wrapper.set(cat); //포장 객체의 set 메소드에 마틸다 입력
		wrapper2.set(creature);
 		
		Cat r1 = wrapper.get();
		Creature r2 = wrapper2.get();
		
		System.out.println(r1);
		System.out.println(r2);
		
		r1.feed();
		r2.feed();
	}

}
