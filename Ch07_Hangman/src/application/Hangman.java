package application;

public class Hangman {
	private boolean running=true;
	
	public void run() {//���α׷� ���� -> �ݺ�
		do {
			displayWord(); 	//ȭ�鿡 �ܾ�ǥ��
			getUserInput();	//�Է¹���
			checkUserInput();	//�´��� üũ =>���� �� running=false;
		} while(!running); // false�� �Ǹ� �ݺ� ����
		
	}

	private void checkUserInput() {
		System.out.println("üũ");
	}

	private void getUserInput() {
		System.out.println("�ܾ���߱�");
	}

	private void displayWord() {
		RandomWord random = new RandomWord();
		System.out.println(random.toString());
	}
}
