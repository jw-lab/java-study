package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String.format은 printf를 문자열로 리턴
		String catCount = String.format("고양이 숫자 : %d\n", Cat.getCount());
		System.out.println(catCount);
		
		Cat cat1 = new Cat("마틸다");
		Cat cat2 = new Cat("라이언");
		Cat cat3 = new Cat("울버린");

		System.out.println(cat1.toString());
		System.out.println(cat2.toString());
		System.out.println(cat3.toString());

		System.out.println(Cat.FOOD);

		catCount = String.format("고양이 숫자 : %d\n", Cat.getCount());
		System.out.println(catCount);
		
		int x = add(1,1);
		System.out.println(x);

	}
	//객체가 필요하지 않고 계산만 하므로 스태틱 메소드로 자동으로 구현된다.
	private static int add(int a, int b) {
		return a+b;
	}

}
