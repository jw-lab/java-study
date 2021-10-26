package nullpointException;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// 널포인터, 0으로 나누었을때 => 런타임 예외 발생
		// 1. 0으로 나누었을때
		try {
			System.out.println(5/0);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		// 2. 객체의 주소값이 널일때!!
		Scanner scan = null; //new Scanner(System.in);
		try {
			scan.nextLine();
			scan.close();	
		} catch (NullPointerException e) {
			System.out.println("객체의 값이 널입니다.");
		}
		
		

	}

}
