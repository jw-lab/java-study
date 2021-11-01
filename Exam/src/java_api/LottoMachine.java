package java_api;

import java.util.Random;

public class LottoMachine {
	private int[] LottoNumbers;
	
	public LottoMachine() {
		// 메소드를 이용해서 로또번호 생성 초기화
		LottoNumbers = generate();
	}
	
	public int[] generate() {
		int[] pickedNumbers = new int[6];
		Random rand = new Random();
		
		//임의의 숫자 6개 추출
		for(int i=0;i<pickedNumbers.length;i++)
			pickedNumbers[i] = rand.nextInt(45)+1;
		
		return pickedNumbers;
	}

	public int[] getLottoNumbers() {
		return LottoNumbers;
	}

	
}
