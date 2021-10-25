package try_catch;

import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력 : ");
		String line = scan.nextLine();
		
		int number = 0;
		boolean isNumber = false;
		
		try {
			number = Integer.parseInt(line);
			isNumber = true;
		} catch (Exception e) {
			System.out.println("숫자 입력이 아닙니다.");
		}
		
		if(isNumber)
			System.out.println("입력한 숫자는 : " + number);
		scan.close();
	}

}
