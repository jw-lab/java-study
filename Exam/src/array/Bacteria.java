package array;

public class Bacteria {

	public static void main(String[] args) {
		//�迭 ����
		int[] bacteria = new int[10];
		//��ü �� ���
		writeLog(bacteria);

		//��� ���
		printLog(bacteria);

	}
	
	// ���׸��� ��ü �� ���
	private static void writeLog(int[] bacteria) {
		int result = 1;
		
		for(int i=0;i<bacteria.length;i++) {
			bacteria[i]=result;
			result *= 2;
		}	
		
	}

	//�迭�� �Է¹޾� ���
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
