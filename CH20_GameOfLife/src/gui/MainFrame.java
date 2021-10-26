package gui;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	private GamePanel gamePanel = new GamePanel();
	
	public MainFrame() {
		super("Game of Life"); 
		
		setLayout(new BorderLayout());
		add(gamePanel, BorderLayout.CENTER);
		
		//키 이벤트
		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				
				switch (code) {
				case 32://스페이스바
					gamePanel.next();
					break;
				case 8://백스페이스
					gamePanel.clear();
					break;
				case 10://엔터
					gamePanel.randomize();
					break;
				}
			}
		});
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true); 
	}
}
