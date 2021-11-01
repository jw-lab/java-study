package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortingList {

	public static void main(String[] args) {
		// 리스트를 정렬
		// 실수타입 리스트 생성
		ArrayList<Double> doubles = new ArrayList<>();
		
		doubles.add(7.38);
		doubles.add(3.88);
		doubles.add(1.45);
		doubles.add(2.35);
		doubles.add(9.28);
		
		Collections.sort(doubles);// 정렬 메소드: List 타입일때 정렬 가능
		
		doubles.forEach(System.out::println);
		
		// 커스텀 객체 정렬
		ArrayList<Person> people = new ArrayList<>();
		
		people.add(new Person("펭수"));
		people.add(new Person("길동"));
		people.add(new Person("라이언"));
		people.add(new Person("둘리"));
		
		Collections.sort(people); // List타입이 아니면 Comparable 인터페이스를 구현한 경우에 가능
	
		people.forEach(System.out::println);
		
		//Comparable 인터페이스를 구현한 compareTo 메소드 예제
		String name1 ="abc";
		String name2 ="def";
		String name3 ="def";
		
		int comparison = name1.compareTo(name2);
		System.out.println(comparison);//-3
		
		comparison = name2.compareTo(name1);
		System.out.println(comparison);//3
		
		System.out.println(name2.equals(name3));
		comparison = name2.compareTo(name3);//true
		System.out.println(comparison);//0
		
	}

}
