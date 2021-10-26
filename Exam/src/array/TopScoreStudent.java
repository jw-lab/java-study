package array;

public class TopScoreStudent {

	public static void main(String[] args) {
		// 배열생성
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
		
		//1등 인덱스 검색
		int i = topIndex(scores);
		
		//결과 출력
		System.out.printf("1등: %s(%d점)\n",names[i],scores[i]);

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
