package anonymousClass;

public class App {

	private String name = "펭수";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new App().start();
	}
	
	private void start() {
		//System.out.println(name);
		Runnable runner = new Runnable() { //익명 클래스 
			//인터페이스를 구현한 클래스를 따로 만들지 않고 
			//객체를 생성할 시 바로 인터페이스를 구현하는 익명 클래스 사용
			@Override
			public void run() {
				System.out.println(name);//내부클래스로 외부클래스의 변수 사용
			}
		};
		
		activate(runner);
//		------------------------------------
		
		//더 간단한 방법, 위와 동일한 동작임
		activate(new Runnable() {
			@Override
			public void run() {
				System.out.println(name);
			}
		});
	}

	private void activate(Runnable runnable) {
		runnable.run();
	}
}
