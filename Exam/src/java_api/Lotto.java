package java_api;


public class Lotto {

	public static void main(String[] args) {
		// 객체생성
		LottoMachine machine = new LottoMachine();//로또번호 생성됨
		
		//가져오기
		int[] numbers = machine.getLottoNumbers();
		
		//결과 출력
		System.out.print("생성 번호:");
		for(int i : numbers)
			System.out.printf("%d ",i);
		

	}

}
