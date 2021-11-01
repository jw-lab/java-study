package java_api.Marathon;

import java.util.HashMap;

public class Marathon {

	public static void main(String[] args) {
		System.out.println(solution(new String[] {"병주","병헌","승언"},new String[] {"병헌","승언"} ));
		System.out.println(solution(new String[] {"병주","병헌","승언","송군"},new String[] {"병주","병헌","송군"} ));
		System.out.println(solution(new String[] {"병주","병헌","승언","병헌"},new String[] {"병주","병헌","승언"} ));
	}

	public static String solution(String[] participant,String[] completion) {
		String answer ="";
		//해쉬맵 hm을 생성한다. 참가자 이름과 함께 인원수를 적을수 있도록 자료형 생서
		HashMap<String, Integer> hm = new HashMap<>();
		
		//참가자 배열에서 이름을 하나씩 꺼내어 이름과 숫자 1을 해쉬맵에 추가한다
		//이때 중복되는 이름은 중복되는만큼 숫자를 더한다
		for(String name : participant)
			if(hm.get(name) == null) //해쉬맵에 이름이 없다면
				hm.put(name, 1);	//이름과 함께 1을 추가한ㄷ
			else {	                //이미 이름이 있다면
				int value = hm.get(name)+1; // 해쉬맵의 그 이름에 해당하는 값을 가져와 +1한다
				hm.put(name, value); //이름이 중복될 경우 업데이트
			}
		
		for(String name : completion) {
			int value = hm.get(name)-1;
			hm.put(name, value);
		}
		
		for(String name : hm.keySet()) //해시맵 요소를 전체 반복
			if(hm.get(name) == 1)
				answer = name;
			
		return answer;
		
	}
}
