package application;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		int apples;
		int bananas;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("����� ������ ? ");
		apples = scan.nextInt();
		System.out.print("�ٳ����� ������ ? ");
		bananas = scan.nextInt();
		scan.close();
		if(apples > bananas) {
			System.out.println("����� �ٳ������� ����");
		}
		else {
			System.out.println("�ٳ����� ������� ���ų� ����");
		}
		System.out.println("���α׷� ����");
	}

}
