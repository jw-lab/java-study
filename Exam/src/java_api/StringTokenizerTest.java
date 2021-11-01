package java_api;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		// 입력 문자열
		String str = "치킨,피자,보쌈,족발,초밥,떡볶이,탕수육";
		
		//구분자를 ,로 하는 StringTokenizer를 생성
		String delim = ",";
		//토크나이저 객체 생성
		StringTokenizer st = new StringTokenizer(str,delim);
		
		//토큰이 존재한다면 반복
		while(st.hasMoreTokens()) {
			//토큰을 하나 꺼내온 뒤 출력
			System.out.println(st.nextToken());
		}

	}

}
