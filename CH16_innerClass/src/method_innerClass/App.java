package method_innerClass;

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
		class Printer{
			public void print() {
				System.out.println(name);
				//���� Ŭ�������� �ܺ� Ŭ������ ���� ��밡��
			}
		}
		
		new Printer().print();
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
