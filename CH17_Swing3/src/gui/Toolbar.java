package gui;

import javax.swing.JButton;

import javax.swing.JToolBar;

import java.awt.Color;
import java.awt.event.*;

class ColorButtonListener implements ActionListener{
	
	private ColorChangeListener colorChanger;
	private Color color;

	
	public ColorButtonListener(ColorChangeListener colorChanger, Color color) {
		this.colorChanger = colorChanger;
		this.color = color;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		colorChanger.changeColor(color);
	}
	
}

public class Toolbar extends JToolBar {

	private static final long serialVersionUID = 1L;

	public Toolbar(ColorChangeListener colorChanger) {
		JButton redButton = new JButton("RED");
		JButton blueButton = new JButton("BLUE");

		redButton.addActionListener(new ColorButtonListener(colorChanger,Color.RED));
		blueButton.addActionListener(new ColorButtonListener(colorChanger,Color.BLUE));
		
		add(redButton);
		add(blueButton);
	}
}
