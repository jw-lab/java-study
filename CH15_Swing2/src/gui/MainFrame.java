package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public MainFrame(String title) {
		super(title); //JFrame�� Ÿ��Ʋ�� ����
		
		MainPanel mainPanel = new MainPanel();
		
		setLayout(new BorderLayout() ); // â�� ������Ʈ(��ư ��)���� ���̱� ����
		
		add(new Toolbar(mainPanel), BorderLayout.NORTH); //â ���ʿ� ���ٸ� ���δ�
		add(mainPanel, BorderLayout.CENTER); //���������ӿ� ���̱� (�߾� ��� ��ġ)
		
		setSize(600,400);// â ������
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// â ������ ���α׷� ����
		setVisible(true); // ���̰� �ϱ�
	}
}
