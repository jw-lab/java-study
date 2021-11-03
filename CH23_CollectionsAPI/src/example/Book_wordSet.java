package example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Book_wordSet {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// 책 파일을 불러와서 단어로 정렬 출력
		File wordsGatsby = new File("Gatsby.txt"); // 프로젝트 폴더 바로 아래 경로를 저장
		System.out.println(wordsGatsby.exists()); //true가 나와야 정상
		
		TreeSet<String> gatsby = loadWords(wordsGatsby);
		
		System.out.println(gatsby.size());//트리셋의 길이, 4338개의 단어가 있다(길이 6이상)
		
		System.out.println();
		
		displayWords(gatsby);
	}

	private static void displayWords(TreeSet<String> wordSet) {
//		List<String> wordList = new ArrayList<>();
//		wordList.addAll(wordSet);
//		for(int i=0;i<wordList.size();i++) {
//			if(i%6==0 && i!=0) //0의 경우 newline 출력하면 안된다.
//				System.out.println();
//			
//			System.out.printf("%-20s",wordList.get(i));//% flag(왼쪽정렬) 자릿수 s
//				
//		}

		//더 간단한 코드
		int count=0;
		for(String w: wordSet) {
			if(w.length()>=6) {
				System.out.printf("%-15s",w);//-는 왼쪽정렬, 15는 자릿수
				count++;
				if(count==6) {//6번 출력하면 새로운 줄 출력		
					System.out.println();
					count=0;// 카운트 초기화
				}
			}
		}
	}

	private static TreeSet<String> loadWords(File file) throws FileNotFoundException, IOException {
		//파일을 입력하면 읽어서 단어들을 TreeSet으로 리턴
		
		TreeSet<String> wordSet = new TreeSet<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			
			String line = null;
			
			while((line=br.readLine())!=null) { //파일을 한줄씩 읽다가 마지막글을 읽고나면 종료
				String[] words = line.split("[^a-zA-Z]+");//영문자 제외한 문자로 split
				
				for(String w : words) {
					if(w.length()>=6)//길이 6이상인 단어만 포함
					wordSet.add(w.toLowerCase());//트리셋에 문자들을 소문자로 하여 추가
				}
			}
		} 
		return wordSet;
	}

}
