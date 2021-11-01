package reading_writing_txt;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {

	public static void main(String[] args) throws IOException {
		// 텍스트 파일 쓰기
		String text = "헬로우! \n 하 와 유 ?"; //이 텍스트를 넣을 것임
		
		Path path = Paths.get("text.txt"); //해당 파일 이름을 가진 상대경로를 저장
		Files.write(path, text.getBytes());//Files.write(파일주소,적을내용);
		//--> 파일이 생성되며 안에 내용도 적힌다.텍스트를 바로 보낼 수 없으므로 바이트 단위로 전송
		
		
		//파일 읽기
		String recivedText = Files.readString(path);//파일의 주소를 읽고 문자열로 반환
		System.out.println(recivedText);
		
		
	}

}
