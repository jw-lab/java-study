package model;

import java.util.Random;

public class World {
	private int rows;//행
	private int columns;//열
	
	private boolean[][] grid;
	

	public World(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		
		grid = new boolean[rows][columns];//이중배열 만들기
	}
	
	public boolean getCell(int row, int col) {//셀의 상태를 리턴
		return grid[row][col];//월드의 grid에서 현재 셀이 녹색인지 검은색인지
	}

	public void setCell(int row, int col, boolean status) {
		grid[row][col] = status;//셀의 상태를 설정(셋)
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColums(int columns) {
		this.columns = columns;
	}

	public void randomize() {
		Random rand= new Random();
		int row = rand.nextInt(rows);
		int col = rand.nextInt(columns);
		grid[row][col] = true;
		
	}

	public void clear() {
		for(int row=0;row<rows;row++)
			for(int col=0;col<columns;col++)
			setCell(row, col, false);
		
	}

	public void next() {
		for(int row=0;row<rows;row++)
			for(int col=0;col<columns;col++) {
				int neighbours = countNeighbours(row,col);
//				System.out.printf("(%d,%d) %d\n",row,col,neighbours);
				/*
				주위 셀 녹색 개수<2, 검은색
				주위 셀 녹색 개수>3, 검은색
				주위 셀 녹색 개수==3, 녹색
				주위 셀 녹색 개수==2, 그대로
				 */
				
				boolean status = false;
				
				if (neighbours<2) {
					status = false;
				} else if (neighbours >3) {
					status = false;
				} else if (neighbours == 3) {
					status = true;
				} else if (neighbours == 2) {
					status = getCell(row, col);
				}
				
				
				grid[row][col] = status;
			}		
	}

	//각각의 그리드 주변에 녹색인 그리드의 갯수를 센다
	private int countNeighbours(int row, int col) {
		int neighbours = 0;
		
		//본인 행, 열을 중심으로 -1~+1 까지 체크
		for(int rowOffset=-1;rowOffset<=1;rowOffset++) {
			for(int colOffset=-1;colOffset<=1;colOffset++) {
				
				if(rowOffset == 0 && colOffset ==0)
					continue;//자기 자신은 카운트 안하게 함
				
				//넘겨받은 행,열 셀을 기준으로 -1~+1까지 더한 행,열을 변수화
				int gridRow = row + rowOffset;
				int gridCol = col + colOffset;
				
				if (gridRow<0) {
					continue;//체크하는 행이 0보다 작으면 다음으로 넘긴다(첫 행보다 작음)
				} else if (gridRow == rows) {
					continue;//마지막 행을 넘어서는 경우 넘긴다.
				}
				
				//컬럼 체크도 동일한 로직
				if (gridCol<0) {
					continue;
				} else if (gridCol == columns) {
					continue;
				}
				
				//체크하는 그리드의 행,열에서 셀의 상태를 받아온다
				boolean status = getCell(gridRow, gridCol);
				
				if(status) {//체크한 주변 그리드 상태가 true면 카운트한다
					neighbours++;
				}
			}
		}
		return neighbours;
	}
	
	
	
}
