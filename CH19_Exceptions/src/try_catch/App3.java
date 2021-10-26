package try_catch;

import java.util.Scanner;

public class App3 {
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int number = getNumber();
		System.out.println("입력한 숫자는 : " + number);
		scan.close();
		
	}

	private static int getNumber() {
		
		int number=0;
		boolean isNumber = false;
		do {
			System.out.print("숫자를 입력 : ");
			String line = scan.nextLine();
			try {
				number = Integer.parseInt(line);
				isNumber = true;
			} catch (Exception e) {
				System.out.println("숫자 입력이 아닙니다.");
			}
		} while (!isNumber);

		return number;
	}

}
