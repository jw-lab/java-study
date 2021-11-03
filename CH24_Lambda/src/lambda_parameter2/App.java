package lambda_parameter2;

interface Runner{
	void execute(String name,String text);
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runner run = (n, t)->System.out.printf("%s님 %s \n",n,t);//execute메소드를 오버라이드 한 것임
		run.execute("펭수","안녕하세요~");

		//메소드로 run 객체 사용
		greet(run);
	}

	private static void greet(Runner run) {
		// TODO Auto-generated method stub
		run.execute("길동", "안녕하세요~");
	}

}
