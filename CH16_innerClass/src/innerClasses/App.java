package innerClasses;

public class App implements Runnable{
	
	private String name = "미키 마우스";

	public static void main(String[] args) {
	
		new App().start();

	}

	private void start() {
		//activate 메소드 실행 방법
		//순서대로 중요도가 높음..
		//1 App클래스가 Runnable을 구현
		activate(this); //this:본인 클래스를 의미함.  
		
		//2 익명 클래스
		activate(new Runnable() {
			public void run() {
				System.out.println(name);
			}
		});
		
		//3 메소드 이너 클래스
		class Runner1 implements Runnable{
			@Override
			public void run() {
				System.out.println(name);
				
			}
			
		}
		activate(new Runner1());
	}
	
	public void activate(Runnable runnable) {
		runnable.run();
	}

	@Override
	public void run() {
		System.out.println(name);
		
	}

}
