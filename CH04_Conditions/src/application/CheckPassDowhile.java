package application;

import java.util.Scanner;

public class CheckPassDowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String USER_PASSWORD = "hello";
		Scanner scan = new Scanner(System.in);
		String password = "";
		
		do {
			System.out.print("Enter password > ");
			password = scan.nextLine();
		} while(!password.equals(USER_PASSWORD));
		
		scan.close();
		System.out.println("Á¢¼Ó½ÂÀÎ.");
	}

}
