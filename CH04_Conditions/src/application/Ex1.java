package application;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("�޴�");
		System.out.println("====");
		System.out.println("1. ����Ʈ '��ο�'");
		System.out.println("2. ����Ʈ '�ȳ� ?'");
		System.out.println("3. ���α׷� ����");
		System.out.print("�ɼ��� ���� > ");
		int menu = scan.nextInt();

		switch (menu) {
		case 1:
			System.out.println("��ο�");
			break;
		case 2:
			System.out.println("�ȳ� ?");
			break;
		case 3:
			System.out.println("�����մϴ� ...");
			break;
		case 10000:
			System.out.println("�̽��Ϳ��׸� �߰��߽��ϴ�.");
			break;
		default:
			System.out.println("�߸��� �ɼ��Դϴ�.");
		}
		scan.close();
	}

}
