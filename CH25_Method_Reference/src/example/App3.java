package example;

import java.util.ArrayList;
import java.util.List;

public class App3 {

	public static void main(String[] args) {
		// 대부분 람다식만 쓴다. 메소드 레퍼런스는 이해하는 정도면 충분하다
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(6);
		numbers.add(4);
		numbers.add(7);
		numbers.add(3);
		numbers.add(6);
		numbers.add(3);
		
//		numbers.removeIf(n->n<5);//5보다 작으면 remove
//		numbers.replaceAll(n->n*2);//2배
		
		numbers.removeIf(App3::filter);
		numbers.replaceAll(App3::map);
		
		numbers.forEach(System.out::println);
	}
	
	// 메소드 레퍼런스
	// 1.static
	// 2.리턴과 매개변수를 맞춘다
	private static boolean filter(int n) {
		return n<5;
	}
	
	private static int map(int n) {
		return n*2;
	}

}
