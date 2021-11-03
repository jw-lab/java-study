package hashMap;

import java.util.HashMap;

public class App {

	public static void main(String[] args) {
		// 해쉬맵은 순서가 있는것이 아니라 키 값으로 인덱스 대체
		HashMap<Integer, String> people = new HashMap<>();
		
		people.put(0, "펭수");
		people.put(1, "길동");
		people.put(3, "라이언");
		people.put(4, "프레드");
		people.put(4, "마이클"); //덮어쓰기 4번에 마이클 입력
		people.put(10, "수지");
		
		System.out.println(people.get(4)); //키 4에 해당하는 value 출력--마이클
		
		String person = people.get(10);//수지
		System.out.println(person);
		
		System.out.println();
		
		//forEach메소드 람다식 표현
		people.forEach((K,V)->{
			System.out.println(K + ":" + V);
		});

	}

}
