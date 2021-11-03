package stream_example;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(6);
		numbers.add(2);
		numbers.add(4);
		
		numbers.stream().forEach(System.out::println);
		
		System.out.println();
		
		numbers.stream().forEach(n->System.out.println(n));
	}

}
