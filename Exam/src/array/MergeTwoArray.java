package array;

public class MergeTwoArray {

	public static void main(String[] args) {
		// 배열 생성
		int[] evens = {
				0,2,4,6,8
		};
		int[] odds = {
				1,3,5,7,9
		};
		
		//배열 병합
		int[] result = merge(evens,odds);
		
		//결과 출력
		System.out.print("결과: ");
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
