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
			System.out.print("비밀번호 입력: ");
			password = scan.nextLine();
			
			if(password.equals(USER_PASSWORD)) {
				System.out.println("접속승인");
				accessOK = true;
				break;
			} else {
				System.out.println("비번이 틀렸습니다.");
			}
		}
		
		scan.close();
		if(!accessOK)
			System.out.println("접속거부");
	}

}
