package try_catch;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է� : ");
		String line = scan.nextLine();
		
		int number = 0;
		
		try {//������ �� �� �ִ� �ڵ带 try�� �ȿ� �ִ´�
			number = Integer.parseInt(line);
			System.out.println("�Է��� ���ڴ� : " + number);
		} catch (Exception e) { //try���� ���� �߻��� catch������ ó���Ѵ�
			System.out.println("���� �Է��� �ƴմϴ�.");
		}
		
		
		scan.close();
	}

}
