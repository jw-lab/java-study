package reading_lineByline;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App2 {

	public static void main(String[] args) {
		String fileLocation = "C:\\JAVA\\java-study\\CH21_Reading_Writing\\text.txt";
		System.out.println(new File(fileLocation).exists());

		//try-with-resources문
		//try(외부자원 사용코드) {나머지 코드}--> 자동으로 close해준다
		try(BufferedReader reader = new BufferedReader(new FileReader(fileLocation));) {
			String line = null;
			while((line=reader.readLine()) != null)
				System.out.println(line);
		} catch (FileNotFoundException e) {
			//파일이 파일주소에 없을때
			System.out.println("파일을 찾지 못함 : "+fileLocation);
		} catch (IOException e) {
			System.out.println("파일을 읽지 못함 : "+fileLocation);
		}
	}

}
