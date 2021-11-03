package exercise;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// 연습문제
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(9);
		list.add(1000);
		list.add(3);
		list.add(6);
		list.add(-20);
		list.add(4);
		
		//0~10 값이 아닌 값들은 모두 제거 --removeIf
		//각 아이템들에 +100 한다 		--replaceAll
		//결과를 표시 					--forEach
		
		list.removeIf(n-> n<0 || 10<n ); //0~10값만 남음
		
		list.replaceAll(n-> n+100); // 남은 아이템들에 100씩 더하기
		
		list.forEach(n->System.out.println(n));

	}

}
