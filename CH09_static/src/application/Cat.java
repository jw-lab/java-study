package application;

public class Cat {
	private String name;// �ν��Ͻ� ������ ��ü�� �����ؾ� ��밡��
	public static final String FOOD = "����� ���";
	//����ƽ�� ��ü�� ������� Ŭ������.���� �� ����Ѵ�. ��ü ���� �ʿ�x, �̹� ������� �ִ�.
	//����ƽ ������ ��ü���� ��������
	private static int count=0;
	private int id;
	
	public Cat(String name) {
		this.name = name;
		count++;
		id=count;
	}
	@Override
	public String toString() {
		return String.format("Cat id: %d, name: %s", id,name);
	}
	
	public static int getCount() {
		return count;
	}
	public void setCount(int count) {
		Cat.count = count;
	}
	
	
}
