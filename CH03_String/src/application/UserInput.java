package application;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("온도를 입력해 주세요 : ");
		double c = scan.nextDouble();
		double f = (c * 9.0/5.0) +32.0;
		
		System.out.printf("섭씨 %.1f는 화씨 %.1f이다.",c,f);
		
		
		
	}

}
