package application;

import javax.swing.SwingUtilities;

import gui.MainFrame;

public class App {

	public static void main(String[] args) {
		//프로그램의 안정성을 위해 권장하는 코드(스윙유틸리티 안에 코드를 넣는다.)
		/*
		SwingUtilities.invokeLater(()->{
			여기안에 코드를 넣는다.
		});
		*/
		SwingUtilities.invokeLater(()->{
			new MainFrame("Test Swing App"); // 새 창 생성
		});
		
	}

}
