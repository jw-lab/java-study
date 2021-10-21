package array;

public class MergeTwoArray {

	public static void main(String[] args) {
		// �迭 ����
		int[] evens = {
				0,2,4,6,8
		};
		int[] odds = {
				1,3,5,7,9
		};
		
		//�迭 ����
		int[] result = merge(evens,odds);
		
		//��� ���
		System.out.print("���: ");
		for(int i : result)
			System.out.printf("%d ",i);
	}

	private static int[] merge(int[] evens, int[] odds) {
		int[] mergedArr = new int[evens.length+odds.length];
		
		for(int i=0;i<evens.length;i++)
			mergedArr[2*i]=evens[i];
		
		for(int i=0;i<odds.length;i++)
			mergedArr[2*i+1]=odds[i];
		
		return mergedArr;
	}

}
