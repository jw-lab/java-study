package reading_lineByline;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		// 파일 위치(location)
		// 자바에서 폴더 경로는 \\ 로 표현된다
		String fileLocation = "C:\\JAVA\\java-study\\CH21_Reading_Writing\\test.txt";
		System.out.println(new File(fileLocation).exists());
		
		//FileReader: 텍스트파일에서 한 문자씩 바이트 단위로 읽는다.
		//BufferedReader: Buffer를 사용해 한번에 여러 글자를 읽을 수 있다. 이때 입력은 바이트 단위인 FileReader 사용
		try {
			//파일을 한줄씩 읽을수 있는 클래스
			BufferedReader reader = new BufferedReader(new FileReader(fileLocation));
			String line = null;
			while((line=reader.readLine()) != null)
				System.out.println(line);
			reader.close();//close 해줘야함-->try-with-resources문으로 한번에 처리가능
		} catch (FileNotFoundException e) {
			//파일이 파일주소에 없을때
			System.out.println("파일을 찾지 못함 : "+fileLocation);
		} catch (IOException e) {
			//파일을 읽지 못할때
			System.out.println("파일을 읽지 못함 : "+fileLocation);
		}
	}

}
