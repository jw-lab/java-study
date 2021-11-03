package multiThread3;

public class App {

	private int value = 0;

	//synchronized 키워드로 한 쓰레드가 사용중에 다른 쓰레드는 사용못함
	private synchronized void increment() {
		value++;
	}
	
	public void run() throws InterruptedException {
		Runnable runnable = () -> {
			for (int i = 0; i < 10000; i++) {
				increment();
			}
		};

		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		Thread t3 = new Thread(runnable);
		
		t1.start();// 쓰레드 시작
		t2.start();// 두 쓰레드가 번갈아가면서 실행됨
		t3.start();


		t1.join();// 메인 쓰레드를 마지막에 실행
		t2.join();
		t3.join();
		
		System.out.println("Value: " +value);
	}

	public static void main(String[] args) throws InterruptedException {
		// 멀티 쓰레드2

		new App().run();

	}

}
