package application;

import java.util.Random;

public class RandomWord {
	private String books= "interface flatware straight psychology inflation partnership original vertical possible priority medieval concentration distortion demonstrator paralyzed president brilliance investment contrary magnetic";
	private String[] word = books.split(" ");
	
	private String selectWord; //������ �ܾ�
	private Random rand = new Random();
	private char[] characters;
	
	
	public RandomWord() {//�����ڷ� ������ ���� �ܾ� ����
		selectWord = word[rand.nextInt(word.length)]; // random.nextInt(����) --> 0~�ش���ڹ̸� ���� ��������  
		characters = new char[selectWord.length()];
	}
	

	public String toString() {

		StringBuilder sb = new StringBuilder();
		
		for(char c : characters) {
			sb.append(c=='\u0000'? "_": c) ;
			sb.append(" ");
		}

		return sb.toString();
	}

	public boolean addGuess(char c) {
		char[] temp=new char[selectWord.length()];
		
		for(int i=0;i<characters.length;i++)
			temp[i]=characters[i];	//�ӽ� �迭 ����
		
		for(int i=0;i<selectWord.length();i++)
			if(c == selectWord.charAt(i))
				characters[i] = c;	//�Ѱܹ��� ���ڰ� ���õ� �ܾ�� ��ġ�ϸ� ����,�ܾ� ������ ����ȴ�.
		
		for(int i=0;i<selectWord.length();i++)
			if(temp[i] != characters[i])
				return true;	//�������� ����Ȱ��� ���Ͽ� ���� �ٸ��� true��ȯ 
		//addGuess�� ���ϰ��� isCorrect�� ���� true�̸� isComplete�� �ٽ� ����
				
		
		return false;
	}

	public boolean isComplete() {
		for(char c : characters)
			if(c == '\u0000')
				return false;
		
		return true;
	}
	
	
}
