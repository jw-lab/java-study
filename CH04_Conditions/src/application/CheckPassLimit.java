package application;

import java.util.Scanner;

public class CheckPassLimit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String USER_PASSWORD = "hello"; 
		String password = "";
		Scanner scan = new Scanner(System.in);
		int count=0;
		
		while(count++<3) {
			System.out.print("Enter password > ");
			password = scan.nextLine();
			if(password.equals(USER_PASSWORD)) {				
				System.out.println("���ӽ���");
				break;
			}
			else if(count == 3){
				System.out.println("����� Ʋ�Ƚ��ϴ�");
				System.out.println("���Ӱź�");
			}
			else
				System.out.println("����� Ʋ�Ƚ��ϴ�");
		} 
		
	}

}
