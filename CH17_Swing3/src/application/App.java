package application;

import javax.swing.SwingUtilities;

import gui.MainFrame;

public class App {

	public static void main(String[] args) {
		//���α׷��� �������� ���� �����ϴ� �ڵ�(������ƿ��Ƽ �ȿ� �ڵ带 �ִ´�.)
		/*
		SwingUtilities.invokeLater(()->{
			����ȿ� �ڵ带 �ִ´�.
		});
		*/
		SwingUtilities.invokeLater(()->{
			new MainFrame("Test Swing App"); // �� â ����
		});
		
	}

}
