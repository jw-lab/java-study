package gui;

import javax.swing.JPanel;

import model.World;

import java.awt.*;
import java.awt.event.*;

public class GamePanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private static final int CELLSIZE = 10; //격자의 크기설정
	private static final Color backgroundColor = Color.BLACK;//배경색 검은색
	private static final Color foregroundColor = Color.GREEN;
	private static final Color gridColor = Color.GRAY;//격자 선 색
	

	private int leftRightMargin;
	private int topBottomMargin;
	
	private World world;
	
	public GamePanel() {
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int row = (e.getY() - topBottomMargin)/CELLSIZE;
				int col = (e.getX() - leftRightMargin)/CELLSIZE;
				if(row>=world.getRows() || col>=world.getColumns())
					return;//클릭된 곳이 지정된 row,col을 넘어서는 경우 그냥 리턴
				
				boolean status = world.getCell(row, col);
				world.setCell(row, col, !status);//현재 녹색인지 체크해서 반전
				repaint();//새로고침
			}
		});
	}

	@Override
	protected void paintComponent(Graphics g) {
		//이 메소드는 자동으로 시작 및 수정시 자신의 모습을 그린다.
		Graphics2D g2 = (Graphics2D)g;//2D그래픽을 사용하기 위해
		
		int width = getWidth();//가로길이
		int height = getHeight();//세로길이
		
		leftRightMargin = ((width % CELLSIZE) + CELLSIZE)/2;
		topBottomMargin = ((height % CELLSIZE) + CELLSIZE)/2;
		
		int rows = (height - 2*topBottomMargin)/CELLSIZE;
		int cols = (width - 2*leftRightMargin)/CELLSIZE;
		
		if(world == null)
			world = new World(rows, cols);
		else if(world.getRows() != rows || world.getColumns() != cols) {
			world= new World(rows, cols);
		}
		
		g2.setColor(backgroundColor);//색 설정
		g2.fillRect(0,0,width,height);//사각형의 좌표에 색을 칠함
		
		drawGrid(g2,width,height);//줄을 긋는 메소드
		
		//전체 그리드 배열에서 현재 값으로 색을 넣는다.
		for(int col=0;col<cols;col++) {
			for(int row=0;row<rows;row++) {
				boolean status = world.getCell(row, col);
				fillcell(g2, row, col, status);
			}
		}
		
	}

	private void fillcell(Graphics2D g2, int row, int col, boolean status) {
		//사각형에 색을 넣는 메소드(그래픽,가로,세로,상태(true녹색,false배경색))
		
		Color color = status ? foregroundColor:backgroundColor;
		g2.setColor(color);
		
		int x= leftRightMargin + (col * CELLSIZE);
		int y= topBottomMargin + (row * CELLSIZE);
		
		g2.fillRect(x+1,y+1,CELLSIZE-1,CELLSIZE-1);
	}

	private void drawGrid(Graphics2D g2, int width, int height) {
		//격자 줄을 긋는 메소드
		g2.setColor(gridColor); //색 설정:회색
		
		for(int x=leftRightMargin;x<=width-leftRightMargin;x += CELLSIZE)
			//줄을 긋는 메소드 (x1,y1) (x2,y2) 좌표대로 줄을 긋는다.
			g2.drawLine(x,topBottomMargin,x,height-topBottomMargin);
		
		for(int y=topBottomMargin;y<=height-topBottomMargin;y += CELLSIZE)
			g2.drawLine(leftRightMargin,y,width-leftRightMargin,y);
		
	}
	
	//엔터키 입력시 랜덤 셀 녹색으로 변경
	public void randomize() {
		world.randomize();
		repaint();
	}

	//백스페이스 키 입력시 모든 격자 검은색으로 변경
	public void clear() {
		world.clear();
		repaint();
		
	}

	//스페이스바 누를 시 동작
	public void next() {
		world.next();
		repaint();
		
	}

}
