package try_catch;

import java.util.Scanner;

public class App3 {
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int number = getNumber();
		System.out.println("�Է��� ���ڴ� : " + number);
		scan.close();
		
	}

	private static int getNumber() {
		
		int number=0;
		boolean isNumber = false;
		do {
			System.out.print("���ڸ� �Է� : ");
			String line = scan.nextLine();
			try {
				number = Integer.parseInt(line);
				isNumber = true;
			} catch (Exception e) {
				System.out.println("���� �Է��� �ƴմϴ�.");
			}
		} while (!isNumber);

		return number;
	}

}
