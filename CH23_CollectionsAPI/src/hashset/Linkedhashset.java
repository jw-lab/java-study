package hashset;

import java.util.LinkedHashSet;

public class Linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 링크드 해쉬셋: 중복 안되고 입력된 순서대로 출력
		LinkedHashSet<String> fruits = new LinkedHashSet<>();
		
		
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("오렌지");
		fruits.add("오렌지");
		fruits.add("배");
		fruits.add("사과");
		fruits.add("사과");
		
		System.out.println(fruits.contains("오렌지"));
		
		for(String fruit: fruits) {
			System.out.println(fruit);
		}
		
	}

}
