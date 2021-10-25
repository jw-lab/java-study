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
		
		//���ٽ� : (�Ű�������)->{�Լ��ڵ�}
		//�Ű������� �ϳ��̰ų� �Լ��ڵ尡 �ϳ��� (),{}��������
		redButton.addActionListener(e->colorChanger.changeColor(Color.RED));
		
		blueButton.addActionListener(new ActionListener() {//�͸�Ŭ����
			public void actionPerformed(ActionEvent e) {
				colorChanger.changeColor(Color.BLUE);
			}
		});
		
		add(redButton);
		add(blueButton);
	}
}
