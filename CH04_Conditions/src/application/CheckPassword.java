package application;

import java.util.Scanner;

public class CheckPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String USER_PASSWORD = "hello";
		
		System.out.print("Enter password > ");
		
		Scanner scan = new Scanner(System.in);
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
