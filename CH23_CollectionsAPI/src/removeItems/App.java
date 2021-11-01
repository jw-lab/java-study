package removeItems;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// 리스트 아이템 제거하기
		Cat c1 = new Cat("마틸다");
		
		List<Cat> cats = new ArrayList<>();
		cats.add(c1);
		cats.add(new Cat("라이언"));
		cats.add(new Cat("마이클"));
		cats.add(new Cat("제니"));
		
		cats.remove(1); //index 1인 라이언 제거
		cats.remove(c1);//c1인 마틸다 제거
		
		cats.forEach(System.out::println);
	}

}
