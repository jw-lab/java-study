package arrayList;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Iterating {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(7);
		list.add(9);
		list.add(123);

		//향상된 for문
		for (Integer n : list)
			System.out.println(n);

		//for 반복문
		for (int i = 0; i < list.size(); i++) {
			Integer n = list.get(i);
			System.out.println(i + ": " + n);
		}

		//forEach 메소드를 익명클래스로 구현한 것
		list.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer e) {
				System.out.println(e);
			}
		});
		
		// 람다식
		list.forEach(e -> {
			System.out.println(e);
		});

		//람다식을 메소드 레퍼런스로 변경한 것
		list.forEach(System.out::println);

	}
}
