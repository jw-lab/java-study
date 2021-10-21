package method;

public class Audition {

	public static void main(String[] args) {
		// 변수생성
		double tomVocal =8.8;
		double tomDance =7.6;
		double kateVocal =9.2;
		double kateDance =7.8;
		
		//결과 출력
		System.out.printf("Tom의 오디션 결과: %s\n",result(tomVocal,tomDance));
		System.out.printf("Kate의 오디션 결과: %s\n",result(kateVocal,kateDance));
	}

	private static String result(double vocal, double dance) {
		return vocal*dance >= 70.0 ? "합격":"불합격";
	}

}
