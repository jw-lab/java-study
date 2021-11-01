package java_api;

public class KnightTest {

	public static void main(String[] args) {
		//객체 생성
		Knight knight1 = new Knight("돈키호테",30);
		
		//정보출력
		System.out.println("[객체생성]");
		System.out.printf("\t%s\n",knight1.toString());
		
		//체력 증가: 기존체력 + 30
		knight1.setHp(knight1.getHp()+30);
		
		//결과출력
		System.out.println("[체력증가 +30]");
		System.out.printf("\t%s\n",knight1.toString());
		
	}

}
