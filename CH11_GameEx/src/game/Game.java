package game;

import java.util.Random;
import java.util.Scanner;

import game.objects.*;

public class Game {
	//����, ����, ��
	GameObject[] objects = {new Scissors(),new Rock(),new Paper()};
	Random random = new Random();
	Scanner scan = new Scanner(System.in);
	
	public void run() {
		System.out.println("�＼�� ���� �����մϴ�");
		
		int wins = 0;
		for(int i=0;i<3;i++) {
			System.out.println(i+1+"��° ���� ���� ...");
			//���� ����
			System.out.print("����(0),����(1),��(2) �� ���ڷ� ���� : ");
			
			
			GameObject ob1 = objects[scan.nextInt()];
			GameObject ob2 = objects[random.nextInt(objects.length)];// 3 �̸� ���� ���� ->0~2
			
			System.out.println("����� ������ : "+ ob1.getName());
			System.out.println("��ǻ�� ������ : "+ ob2.getName());
			
			int score = ob1.compare(ob2);//0,1,-1 ���, �̱�, �й�
			wins += score;
		}
			
		//�� ��� ���
		if(wins > 0)
			System.out.println("����� �¸�!");
		else if(wins<0)
			System.out.println("����� �й�!");
		else
			System.out.println("�����ϴ�!");
		
		scan.close();
	}

	
}
