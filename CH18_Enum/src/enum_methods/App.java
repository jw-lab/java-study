package enum_methods;

public class App {

	public static void main(String[] args) {
		Fruit[] fruits = Fruit.values(); // enum.values() => �迭�� ����
		
		for(Fruit f: fruits) {
			System.out.println(f);
		}
		
		//�� �ڵ� �����ϰ� ����
		for(Fruit f : Fruit.values())
			System.out.println(f);
		
		//ordinal() �޼ҵ�� ����� ����(�ε��� 0���� ����)�� ����
		System.out.println(Fruit.BANANA.ordinal());
		
		//valueOf("��")�޼ҵ�� ���� ���� ����� ã�Ƽ� ����
		Fruit f1 = Fruit.valueOf("ORANGE");//���ڿ� ORANGE�� ���� enum����� ã��
		System.out.println(f1);
		System.out.println(f1 == Fruit.ORANGE);
	}

}
