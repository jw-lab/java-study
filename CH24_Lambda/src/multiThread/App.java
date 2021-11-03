package multiThread;

public class App {
	//자바에서는 main 쓰레드가 먼저 실행된다.
	//새로운 t1 쓰레드를 생성하고 t1.start()로 새로운 쓰레드를 실행한다.
	//즉, 메인 쓰레드를 가장 먼저 실행하고 그 다음에 t1 쓰레드가 실행된다.
	public static void main(String[] args) throws InterruptedException {
		// 멀티 쓰레드
		Runnable runnable = ()->{
			for(int i=0;i<100;i++) {
				System.out.println("i : "+ i);
				try {
					//쓰레드를 0.5초동안 작업 대기
					Thread.sleep(500);
				} catch (InterruptedException e) {
					//대기 중에 예외발생시
					e.printStackTrace();
				}
			}
		};
		
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		
		//t1.start() 메소드는 t1의 runnable 람다식 실행
		t1.start();//쓰레드 시작
		t2.start();//두 쓰레드가 번갈아가면서 실행됨
		
		//t1.join() 메소드는 메인 쓰레드를 대기시킨다.
		t1.join();// 메인 쓰레드를 마지막에 실행
		t2.join();
		
		System.out.println("헬로우");//가장 먼저 출력됨
	}

}
