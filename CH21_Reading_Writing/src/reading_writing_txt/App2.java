package reading_writing_txt;

import java.io.File;

public class App2 {

	public static void main(String[] args) {
		// 파일 위치(location)
		// 자바에서 폴더 경로는 \\ 로 표현된다
		// 파일의 절대경로를 문자열로 표시
		String fileLocation = "C:\\JAVA\\java-study\\CH21_Reading_Writing\\test.txt";
		System.out.println(new File(fileLocation).exists());
	}

}
