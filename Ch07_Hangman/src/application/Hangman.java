package application;

import java.util.Scanner;

public class Hangman {
	private boolean running=true;
	private RandomWord word = new RandomWord();
	private Scanner scan = new Scanner(System.in);
	private int remainTries = 7;
	private char lastGuess;
	public void run() {//���α׷� ���� -> �ݺ�
		do {
			displayWord(); 	//ȭ�鿡 �ܾ�ǥ��
			getUserInput();	//�Է¹���
			checkUserInput();	//�´��� üũ =>���� �� running=false;
		} while(running); // false�� �Ǹ� �ݺ� ����
	}

	private void checkUserInput() {
		
		boolean isCorrect = word.addGuess(lastGuess);
		
		if(isCorrect) {
			if(word.isComplete()) {
				System.out.println("������!!");
				System.out.println("�� �õ�Ƚ�� : "+ (7-remainTries));
				System.out.println("������ : "+word.getSelectWord());
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

		System.out.print("�� ���� �Է� : ");
		String guess = scan.nextLine();
		lastGuess = guess.charAt(0);
	}

	private void displayWord() {
		System.out.println("���� �õ� Ƚ�� : "+remainTries);
		System.out.println(word.toString());
	}

	public void close() {
		scan.close();
	}
	
}
