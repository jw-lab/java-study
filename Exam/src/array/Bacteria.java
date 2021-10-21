package array;

public class Bacteria {

	public static void main(String[] args) {
		//배열 생성
		int[] bacteria = new int[10];
		//개체 수 기록
		writeLog(bacteria);

		//결과 출력
		printLog(bacteria);

	}
	
	// 박테리아 개체 수 기록
	private static void writeLog(int[] bacteria) {
		int result = 1;
		
		for(int i=0;i<bacteria.length;i++) {
			bacteria[i]=result;
			result *= 2;
		}	
		
	}

	//배열을 입력받아 출력
	private static void printLog(int[] bacteria) {
		System.out.print("[");
		for(int i=0;i<bacteria.length;i++) {
			System.out.printf("%d", bacteria[i]);
			if(i != bacteria.length-1)
				System.out.print(",");
		}
		System.out.print("]");
			
		
	}

}
