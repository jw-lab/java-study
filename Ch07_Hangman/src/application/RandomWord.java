package application;

import java.util.Random;

public class RandomWord {
	private String books= "routine\r\n"
			+ "houseplant\r\n"
			+ "clue\r\n"
			+ "clearance\r\n"
			+ "loss\r\n"
			+ "taste\r\n"
			+ "taxi\r\n"
			+ "cap\r\n"
			+ "still\r\n"
			+ "feeling";
	private String[] words = books.split("\r\n");
	
	private String selectWord;
	private Random rand = new Random();
	private char[] characters;
	
	
	public RandomWord() {
		selectWord = words[rand.nextInt(words.length)];
		characters = new char[selectWord.length()];
	}
	
	public String toString() {
		String text= "";
		
		for(char c : characters) {
			text += "_";
			text +=" ";
		}
		System.out.println(selectWord);
		return text;
	}
	
	
}
