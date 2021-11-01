package java_api.Map;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// 이름을 키로, 이메일을 값으로 담을 해시맵 생성
		HashMap<String, String> emails = new HashMap<>();

		// 데이터 저장
		emails.put("홍팍", "sehong@cloudstudying.kr");
		emails.put("나리", "nari@cloudstudying.kr");
		emails.put("정애", "jungae@cloudstudying.kr");

		// 해시맵 크기 출력
		System.out.printf("emails.size() -> %d\n", emails.size());

		// key 목록 출력
		System.out.println("\n== key set ==");
		for (String key : emails.keySet())
			System.out.println(key);

		// value 목록 출력
		System.out.println("\n== values ==");
		for (String value : emails.values())
			System.out.println(value);
	}

}
