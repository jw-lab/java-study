package application;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("�µ��� �Է��� �ּ��� : ");
		double c = scan.nextDouble();
		double f = (c * 9.0/5.0) +32.0;
		
		System.out.printf("���� %.1f�� ȭ�� %.1f�̴�.",c,f);
		
		
		
	}

}
