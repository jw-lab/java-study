package gui;

import javax.swing.JPanel;
import java.awt.Color;
public class MainPanel extends JPanel implements ColorChangeListener{

	private static final long serialVersionUID = 1L;
	
	public MainPanel() {
		setBackground(Color.GREEN); // 색 설정
	}

	@Override
	public void changeColor(Color color) {
		setBackground(color);
	}
}
