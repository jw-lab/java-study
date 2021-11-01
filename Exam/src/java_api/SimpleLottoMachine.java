package java_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SimpleLottoMachine {

	public static void main(String[] args) {
		// 45개의 공을 만든다
		ArrayList<Integer> numbers = new ArrayList<>();
		for(int i=0;i<45;i++)
			numbers.add(i+1);//1~45
		
		//섞는다
		Collections.shuffle(numbers);
		
		//뽑는다
		int[] picked = new int[6];
		for(int i=0;i<picked.length;i++)
			picked[i]=numbers.get(i);//numbers의 앞 6개 숫자를 가져옴
		
		//결과 출력
		System.out.printf("자동 생성 번호: %s",Arrays.toString(picked));
	}

}
