package java_api.Map;

import java.util.HashMap;

public class MapEx {

	public static void main(String[] args) {
		// Map은 Key와 Value로 표현된다. 대표적으로 단어장을 생각하면 쉽다.
		// Map은 set 처럼 TreeMap(정렬)과 HashMap(비정렬) 이 있다.
		
		// HashMap 생성(키-string,값-string)
		HashMap<String, String> words = new HashMap<>();
		
		// 단어 담기 (key , value)
		words.put("water", "물");
		words.put("bottle", "병");
		words.put("beer", "맥주");
		
		//key를 통해서 value가져오기
		System.out.println(words.get("beer"));//맥주
		System.out.println(words.get("water"));//물
	}

}
