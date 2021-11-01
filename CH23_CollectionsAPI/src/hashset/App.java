package hashset;

import java.util.HashSet;

public class App {

	public static void main(String[] args) {
		// set은 순서가 없고, 데이터 중복이 안됨
		HashSet<String> fruits = new HashSet<>();
		
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
