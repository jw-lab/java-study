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
				System.out.println("접속승인");
				break;
			}
			else if(count == 3){
				System.out.println("비번이 틀렸습니다");
				System.out.println("접속거부");
			}
			else
				System.out.println("비번이 틀렸습니다");
		} 
		
	}

}
