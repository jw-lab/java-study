package example_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {
		// Person 객체, 원격수업여부(true,false)
		Map<Person, Boolean> people1 = new HashMap<>();
		
		//맵에서 키로 중복을 결정하는데, Person 클래스에서 equals메소드를 name으로 수정하면 name이 같으면 중복으로 인식
		inputMap(people1); //입력
		displayMap(people1);//출력
		

		// Linked
		Map<Person, Boolean> people2 = new LinkedHashMap<>();
		inputMap(people2);
		displayMap(people2);

		// Tree
		//트리맵은 정렬을 해야하는데 키값인 Person객체가 비교할수 있는 메소드가 없다 => Comparable 인터페이스 구현
		Map<Person, Boolean> people3 = new TreeMap<>();
		inputMap(people3);
		displayMap(people3);
		
	}

	private static void displayMap(Map<Person, Boolean> map) {
		//map에 있는 key, value 값을 출력
		map.forEach((k, v) -> {
			System.out.println(k + ":" + v);
		});
		System.out.println();
		
	}

	private static void inputMap(Map<Person, Boolean> map) {
		//map에 key,value 입력
		map.put(new Person("펭수"), true);
		map.put(new Person("길동"), true);
		map.put(new Person("라이언"), false);
		map.put(new Person("둘리"), false);
		map.put(new Person("라이언"), false); // 중복이 되지 않는다.
		map.put(new Person("둘리"), true); // 원격 여부 업데이트
		
	}

}
