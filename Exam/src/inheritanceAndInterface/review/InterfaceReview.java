package inheritanceAndInterface.review;

import java.util.ArrayList;

public class InterfaceReview {

	public static void main(String[] args) {
		// 객체 생성
		Sounding[] sounds = new Sounding[4];
		sounds[0] = new Dog();
		sounds[1] = new Baby();
		sounds[2] = new Tiger();
		sounds[3] = new Robot();

		//ArrayList를 통한 객체 저장
		ArrayList<Sounding> list = new ArrayList<>();
		for (int i = 0; i < sounds.length; i++)
			list.add(sounds[i]);
		
		//메소드 구현
		for (int i = 0; i < sounds.length; i++)
			list.get(i).sound();

	}

}
