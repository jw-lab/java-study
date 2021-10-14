package application;

public class Hangman {
	private boolean running=true;
	
	public void run() {//프로그램 시작 -> 반복
		do {
			displayWord(); 	//화면에 단어표시
			getUserInput();	//입력받음
			checkUserInput();	//맞는지 체크 =>맞을 시 running=false;
		} while(!running); // false가 되면 반복 종료
		
	}

	private void checkUserInput() {
		System.out.println("체크");
	}

	private void getUserInput() {
		System.out.println("단어맞추기");
	}

	private void displayWord() {
		RandomWord random = new RandomWord();
		System.out.println(random.toString());
	}
}
