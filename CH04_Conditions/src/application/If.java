package application;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		int apples;
		int bananas;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("사과의 개수는 ? ");
		apples = scan.nextInt();
		System.out.print("바나나의 개수는 ? ");
		bananas = scan.nextInt();
		scan.close();
		if(apples > bananas) {
			System.out.println("사과가 바나나보다 많음");
		}
		else {
			System.out.println("바나나가 사과보다 많거나 같음");
		}
		System.out.println("프로그램 종료");
	}

}
