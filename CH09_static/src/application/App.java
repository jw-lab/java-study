package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String.format�� printf�� ���ڿ��� ����
		String catCount = String.format("����� ���� : %d\n", Cat.getCount());
		System.out.println(catCount);
		
		Cat cat1 = new Cat("��ƿ��");
		Cat cat2 = new Cat("���̾�");
		Cat cat3 = new Cat("�����");

		System.out.println(cat1.toString());
		System.out.println(cat2.toString());
		System.out.println(cat3.toString());

		System.out.println(Cat.FOOD);

		catCount = String.format("����� ���� : %d\n", Cat.getCount());
		System.out.println(catCount);
		
		int x = add(1,1);
		System.out.println(x);

	}
	//��ü�� �ʿ����� �ʰ� ��길 �ϹǷ� ����ƽ �޼ҵ�� �ڵ����� �����ȴ�.
	private static int add(int a, int b) {
		return a+b;
	}

}
