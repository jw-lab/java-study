package array;

public class TopScoreStudent {

	public static void main(String[] args) {
		// �迭����
		String[] names = {
				"Elena",
				"Suzie",
				"John",
				"Emily",
				"Neda",
				"Kate",
				"Alex",
				"Daniel",
				"Hamilton"
		};
		int[] scores = {
				65,74,23,75,68,96,88,98,54
		};
		
		//1�� �ε��� �˻�
		int i = topIndex(scores);
		
		//��� ���
		System.out.printf("1��: %s(%d��)\n",names[i],scores[i]);

	}

	private static int topIndex(int[] scores) {
		int top = 0;
		int topindex = 0;
		
		for(int i=0;i<scores.length;i++) 
			if(scores[i] > top) {
				top = scores[i];
				topindex = i;
			}
					
		return topindex;
	}

}
