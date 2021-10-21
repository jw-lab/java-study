package application;

import java.util.Random;

public class RandomWord {
	private String books= "interface flatware straight psychology inflation partnership original vertical possible priority medieval concentration distortion demonstrator paralyzed president brilliance investment contrary magnetic";
	private String[] word = books.split(" ");
	
	private String selectWord; //선택한 단어
	private Random rand = new Random();
	private char[] characters;
	
	
	public RandomWord() {//생성자로 생성시 랜덤 단어 선택
		selectWord = word[rand.nextInt(word.length)]; // random.nextInt(숫자) --> 0~해당숫자미만 까지 랜덤숫자  
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
			temp[i]=characters[i];	//임시 배열 생성
		
		for(int i=0;i<selectWord.length();i++)
			if(c == selectWord.charAt(i))
				characters[i] = c;	//넘겨받은 문자가 선택된 단어와 일치하면 대입,단어 끝까지 진행된다.
		
		for(int i=0;i<selectWord.length();i++)
			if(temp[i] != characters[i])
				return true;	//기존값과 변경된값을 비교하여 서로 다르면 true반환 
		//addGuess의 리턴값이 isCorrect로 가서 true이면 isComplete를 다시 실행
				
		
		return false;
	}

	public boolean isComplete() {
		for(char c : characters)
			if(c == '\u0000')
				return false;
		
		return true;
	}
	
	
}
