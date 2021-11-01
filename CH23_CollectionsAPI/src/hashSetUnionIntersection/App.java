package hashSetUnionIntersection;

import java.util.HashSet;

public class App {

	public static void main(String[] args) {
		HashSet<String> fruits1 = new HashSet<>();
		fruits1.add("사과");
		fruits1.add("배");
		fruits1.add("딸기");
		fruits1.add("수박");

		HashSet<String> fruits2 = new HashSet<>();
		fruits2.add("체리");
		fruits2.add("배");
		fruits2.add("사과");
		fruits2.add("오렌지");

		HashSet<String> union = new HashSet<>(fruits1);// 생성자 오버로드--해쉬셋을 넣어서 생성
		union.addAll(fruits2);// 기존 셋에 다른 셋 추가 --중복이 제거되므로 합집합

		union.forEach(System.out::println);

		System.out.println();

		HashSet<String> intersection = new HashSet<>(fruits1);
		intersection.retainAll(fruits2); //교집합

		intersection.forEach(System.out::println);
		
		//차집합 A-B
		System.out.println();
		
		HashSet<String> minus = new HashSet<>(fruits1);
		minus.removeAll(fruits2); //첫 set에서 두번째 set 제거
		
		minus.forEach(System.out::println);
	}

}
