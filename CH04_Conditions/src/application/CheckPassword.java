package application;

import java.util.Scanner;

public class CheckPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String USER_PASSWORD = "hello";
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter password > ");
		
		String password = scan.nextLine();
		scan.close();
		
		if(password.equals(USER_PASSWORD)) {
			System.out.println("立加 铰牢.");
		}
		else {
			System.out.println("立加 阂啊.");
		}
	}

}
