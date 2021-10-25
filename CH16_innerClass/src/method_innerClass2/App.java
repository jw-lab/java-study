package method_innerClass2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {
	private String name;
	
	public App() {
		// �⺻ ������
		name = "�����ں���";
	}
	
	public String getName() {
		return name;
	}
	
	public void run() {
		//System.out.println(name);
//		class Printer implements Runnable{
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				System.out.println(name);
//			}
//		}
//		
		//new Printer().print();
		
		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
		service.scheduleAtFixedRate(new Runnable() {
			
			@Override
			public void run() {
				System.out.println(name);
				
			}
		}, 0, 1, TimeUnit.SECONDS);
	}
	
	public static void main(String[] args) {
		// �޼ҵ� ���� Ŭ����
		//System.out.println(name);--����/ ����ƽ �޼ҵ忡���� Ŭ������ �ν��Ͻ� ������ �޼ҵ� ���x
		//����ƽ ������� ��� ����
		//���� ������ ��ü(�ν��Ͻ�)�� �����ؾ� ����� �� �ִ�.
		
		App app = new App();
		app.run();
		
	}

}
