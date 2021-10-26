package array;

public class Factorial {

	public static void main(String[] args) {
		// 입력값 받기
		
		// 결과 출력
		printFactorial(4);

	}

	private static void printFactorial(int n) {
		int result =1;
		System.out.printf("%d! = ",n);
		for(int i=n;i>0;i--) {
			System.out.printf("%d",i);
			result = result*i;
			if(i != 1)
				System.out.print(" x ");
		}
		System.out.printf(" = %d\n",result);
	}

}
