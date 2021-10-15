package application;

import java.util.Scanner;

public class Hangman {
	private boolean running=true;
	private RandomWord word = new RandomWord();
	private Scanner scan = new Scanner(System.in);
	private int remainTries = 7;
	private char lastGuess;
	public void run() {//프로그램 시작 -> 반복
		do {
			displayWord(); 	//화면에 단어표시
			getUserInput();	//입력받음
			checkUserInput();	//맞는지 체크 =>맞을 시 running=false;
		} while(running); // false가 되면 반복 종료
	}

	private void checkUserInput() {
		
		boolean isCorrect = word.addGuess(lastGuess);
		
		if(isCorrect) {
			if(word.isComplete()) {
				System.out.println("맞췄어요!!");
				System.out.println("총 시도횟수 : "+ (7-remainTries));
				System.out.println("정답은 : "+word.getSelectWord());
				running = false;
			}
		} else {
			remainTries--;
			if(remainTries == 0) {
				System.out.println("Game Over!");
				running = false;
			}
		}
		
	}

	private void getUserInput() {

		System.out.print("한 문자 입력 : ");
		String guess = scan.nextLine();
		lastGuess = guess.charAt(0);
	}

	private void displayWord() {
		System.out.println("남은 시도 횟수 : "+remainTries);
		System.out.println(word.toString());
	}

	public void close() {
		scan.close();
	}
	
}
