package static_innerClass;

public class App {

	public static void main(String[] args) {
		Person p1 =new Person();
		p1.print();
		//�̳�Ŭ���� (��ü�� ���鶧�� ���� �ܺ�Ŭ���� ��ü�� ������ ����� �ִ�)
		Person.Head head = p1.new Head();//��� �ϴ� ��������� �˸� �ȴ�. ���� ���x
		head.print();
		
		//����ƽ �̳� Ŭ���� --������...
		Person.Body body = new Person.Body();
		body.print();
	}

}
