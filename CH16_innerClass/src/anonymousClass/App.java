package anonymousClass;

public class App {

	private String name = "���";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new App().start();
	}
	
	private void start() {
		//System.out.println(name);
		Runnable runner = new Runnable() { //�͸� Ŭ���� 
			//�������̽��� ������ Ŭ������ ���� ������ �ʰ� 
			//��ü�� ������ �� �ٷ� �������̽��� �����ϴ� �͸� Ŭ���� ���
			@Override
			public void run() {
				System.out.println(name);//����Ŭ������ �ܺ�Ŭ������ ���� ���
			}
		};
		
		activate(runner);
//		------------------------------------
		
		//�� ������ ���, ���� ������ ������
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
