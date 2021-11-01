package java_api.Set;

import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		//String 저장을 위한 트리셋 객체 생성
		TreeSet<String> names = new TreeSet<>();
		
		//객체 add
		names.add("Daniel");
		names.add("Brian");
		names.add("Eugene");
		names.add("Adam");
		names.add("Cate");
		
		//TreeSet은 자동으로 정렬된다(A~Z)
		//HashSet은 비정렬
		
		//정보 출력
		System.out.printf("names.size() -> %d\n", names.size());// 객체의 크기
		System.out.printf("names.first() -> %s\n", names.first());// 첫 요소
		System.out.printf("names.last() -> %s\n", names.last());// 마지막요소
		
		//Set의 모든 요소 출력
		System.out.println("==for each 구문 출력 ==");
		for(String s : names)
			System.out.println(s);
	}
}
