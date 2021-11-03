package multiThread2;

public class App {

	private int value = 0;

	public void run() throws InterruptedException {
		Runnable runnable = () -> {
			for (int i = 0; i < 10000; i++) {
				value++;//같은 변수를 다른 쓰레드가 사용하는 경우 연산과정이 겹쳐 에러발생--synchronized 키워드 사용
			}
		};

		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);

		t1.start();// 쓰레드 시작
		t2.start();// 두 쓰레드가 번갈아가면서 실행됨
		//System.out.println("Value: " +value);

		t1.join();// 메인 쓰레드를 마지막에 실행
		t2.join();
		
		System.out.println("Value: " +value);
	}

	public static void main(String[] args) throws InterruptedException {
		// 멀티 쓰레드2

		new App().run();

	}

}
