package hashcode_this;

public class App {

	public static void main(String[] args) {
		Fox fox1 = new Fox();

		System.out.println(fox1.toString());
		System.out.println(fox1.hashCode());
		System.out.printf("%x\n",fox1.hashCode());//�ؽ��ڵ�(�ּҰ�)�� 16������ ��Ÿ��

		Fox fox2 = new Fox();

		System.out.println(fox2);

	}

}
