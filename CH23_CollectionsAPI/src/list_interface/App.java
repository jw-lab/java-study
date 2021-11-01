package list_interface;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// List인터페이스
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(5);
		numbers.add(7);
		numbers.add(5);
		
		displayList(numbers);

	}

	private static void displayList(List<Integer> list) {
		// TODO Auto-generated method stub
		list.forEach(System.out::println);
	}

}
