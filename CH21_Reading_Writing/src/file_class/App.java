package file_class;

import java.io.File;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		// file 객체를 만들때 pathname은 상대경로로 현재 프로젝트 안에서 폴더를 찾는다. 
		File current = new File(".");// . 은 현재 폴더 위치로 객체를 만들었다
		File current2= new File("src");// src 폴더를 기준으로 객체를 만들었다.
		
		//AbsolutePath는 상위경로(../)나 현재경로(./)를 전부 표시
		//CanonicalPath는 .. or . 은 무시한 절대경로
		System.out.println(current.getAbsolutePath());//객체의 절대경로
		System.out.println(current.getCanonicalPath());//객체의 절대경로
		
		System.out.println(current2.getAbsolutePath());//객체의 절대경로
		System.out.println(current2.getCanonicalPath());//객체의 절대경로
		//폴더안의 내부 파일들의 이름 출력
		for(String f : current2.list())
			System.out.println(f);
	}

}
