package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public MainFrame(String title) {
		super(title); //JFrame에 타이틀을 생성
		
		MainPanel mainPanel = new MainPanel();
		Toolbar toolbar = new Toolbar();
		
		toolbar.setColorChanger(mainPanel);
		
		setLayout(new BorderLayout() ); // 창에 컴포넌트(버튼 등)들을 붙이기 위함
		
		add(toolbar, BorderLayout.NORTH); //창 위쪽에 툴바를 붙인다
		add(mainPanel, BorderLayout.CENTER); //메인프레임에 붙이기 (중앙 가운데 위치)
		
		setSize(600,400);// 창 사이즈
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 창 닫을시 프로그램 종료
		setVisible(true); // 보이게 하기
	}
}
