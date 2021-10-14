package application;

import java.util.Scanner;

public class NewArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[3];
		int total = 0;
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < numbers.length; i++) {
			System.out.print("숫자를 입력: ");
			numbers[i] = scan.nextInt();
			total += numbers[i];
		}
		scan.close();
		System.out.println("입력한 값은:");
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		System.out.printf("Total : %d", total);
	}

}
