package treeSet;

import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		// 트리셋은 정렬된 셋
		// 트리셋은 비교가 가능해야함 --> Comparable 구현
		TreeSet<Person> people = new TreeSet<>();
		
		people.add(new Person("펭수"));
		people.add(new Person("라이언"));
		people.add(new Person("가가멜"));
		people.add(new Person("스머프"));
		
		for(Person p : people) {
			System.out.println(p.toString());
		}
	}

}
