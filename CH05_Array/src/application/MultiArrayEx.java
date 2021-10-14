package application;

public class MultiArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] values = {
				{1,5,7},
				{9,6,3},
				{2,4,6}
		};
		int total=0;
		
		for(int i=0;i<values.length;i++)
//			for(int x : values[i]) -- foreach
//				total += x;
			for(int j=0;j<values[i].length;j++)
				total += values[i][j];
		System.out.println(total);
		
		
	}

}
