package gui;

import javax.swing.JButton;

import javax.swing.JToolBar;

import java.awt.Color;
import java.awt.event.*;


public class Toolbar extends JToolBar {

	private static final long serialVersionUID = 1L;

	private ColorChangeListener colorChanger;
	
	public void setColorChanger(ColorChangeListener colorChanger) {
		this.colorChanger = colorChanger;
	}

	public Toolbar() {
		JButton redButton = new JButton("RED");
		JButton blueButton = new JButton("BLUE");
		
		//람다식 : (매개변수들)->{함수코드}
		//매개변수가 하나이거나 함수코드가 하나면 (),{}생략가능
		redButton.addActionListener(e->colorChanger.changeColor(Color.RED));
		
		blueButton.addActionListener(new ActionListener() {//익명클래스
			public void actionPerformed(ActionEvent e) {
				colorChanger.changeColor(Color.BLUE);
			}
		});
		
		add(redButton);
		add(blueButton);
	}
}
