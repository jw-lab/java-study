package innerClasses;

public class App implements Runnable{
	
	private String name = "��Ű ���콺";

	public static void main(String[] args) {
	
		new App().start();

	}

	private void start() {
		//activate �޼ҵ� ���� ���
		//������� �߿䵵�� ����..
		//1 AppŬ������ Runnable�� ����
		activate(this); //this:���� Ŭ������ �ǹ���.  
		
		//2 �͸� Ŭ����
		activate(new Runnable() {
			public void run() {
				System.out.println(name);
			}
		});
		
		//3 �޼ҵ� �̳� Ŭ����
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
