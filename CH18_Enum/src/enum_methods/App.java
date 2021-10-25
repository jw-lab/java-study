package enum_methods;

public class App {

	public static void main(String[] args) {
		Fruit[] fruits = Fruit.values(); // enum.values() => 배열로 리턴
		
		for(Fruit f: fruits) {
			System.out.println(f);
		}
		
		//위 코드 간단하게 수정
		for(Fruit f : Fruit.values())
			System.out.println(f);
		
		//ordinal() 메소드는 상수의 순서(인덱스 0부터 시작)를 리턴
		System.out.println(Fruit.BANANA.ordinal());
		
		//valueOf("값")메소드는 값과 같은 상수를 찾아서 리턴
		Fruit f1 = Fruit.valueOf("ORANGE");//문자열 ORANGE와 같은 enum상수를 찾음
		System.out.println(f1);
		System.out.println(f1 == Fruit.ORANGE);
	}

}
