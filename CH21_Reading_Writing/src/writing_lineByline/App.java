package writing_lineByline;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		String fileLocation = "C:\\JAVA\\java-study\\CH21_Reading_Writing\\text.txt";
		
		try (BufferedWriter br = new BufferedWriter(new FileWriter(fileLocation))) {
			br.write("오렌지");
			br.newLine();
			br.write("apple");
			br.newLine();
			br.write("banana");
			br.newLine();
			br.write("배");
		} catch (IOException e) {
			System.out.println("파일을 쓸 수 없음 : "+fileLocation);
		}
		
		System.out.println("파일 쓰기 완료 : "+fileLocation);
	}

}
