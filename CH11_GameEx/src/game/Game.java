package game;

import java.util.Random;
import java.util.Scanner;

import game.objects.*;

public class Game {
	//가위, 바위, 보
	GameObject[] objects = {new Scissors(),new Rock(),new Paper()};
	Random random = new Random();
	Scanner scan = new Scanner(System.in);
	
	public void run() {
		System.out.println("삼세판 게임 시작합니다");
		
		int wins = 0;
		for(int i=0;i<3;i++) {
			System.out.println(i+1+"번째 게임 시작 ...");
			//유저 선택
			System.out.print("가위(0),바위(1),보(2) 중 숫자로 선택 : ");
			
			
			GameObject ob1 = objects[scan.nextInt()];
			GameObject ob2 = objects[random.nextInt(objects.length)];// 3 미만 랜덤 숫자 ->0~2
			
			System.out.println("당신의 선택은 : "+ ob1.getName());
			System.out.println("컴퓨터 선택은 : "+ ob2.getName());
			
			int score = ob1.compare(ob2);//0,1,-1 비김, 이김, 패배
			wins += score;
		}
			
		//비교 결과 출력
		if(wins > 0)
			System.out.println("당신의 승리!");
		else if(wins<0)
			System.out.println("당신의 패배!");
		else
			System.out.println("비겼습니다!");
		
		scan.close();
	}

	
}
