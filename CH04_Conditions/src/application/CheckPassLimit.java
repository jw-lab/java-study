package application;

import java.util.Scanner;

public class CheckPassLimit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String USER_PASSWORD = "hello";
		Scanner scan = new Scanner(System.in);
		
		boolean accessOK = false;
		
		String password ="";
		for(int i=0;i<3;i++) {
			System.out.print("��й�ȣ �Է�: ");
			password = scan.nextLine();
			
			if(password.equals(USER_PASSWORD)) {
				System.out.println("���ӽ���");
				accessOK = true;
				break;
			} else {
				System.out.println("����� Ʋ�Ƚ��ϴ�.");
			}
		}
		
		scan.close();
		if(!accessOK)
			System.out.println("���Ӱź�");
	}

}
