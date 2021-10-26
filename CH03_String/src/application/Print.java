package application;

public class Print {

	public static void main(String[] args) {
		// printf 출력
		int age = 25;
		String addr = "부산";
		
		System.out.printf("age: %d\n", age);
		System.out.printf("age: %d, addr: %s\n", age,addr);
		
		
		double pi = 3.141592;
		System.out.printf("pi: %.2f",pi);
	}

}
