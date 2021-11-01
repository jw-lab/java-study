package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		LinkedList<Double> numbers = new LinkedList<>();

		double total = 0;
		while (true) {

			System.out.print("숫자 또는 'q' 입력 > ");

			String input = scan.nextLine();// 엔터전까지 입력한 문자열을 저장

			input = input.trim();// 앞 뒤 공백제거

			if (input.equalsIgnoreCase("q")) {
				// equals:대소문자 구분
				// equalsIgnoreCase: 대소문자 구분 없이 검사
				// ex) "A".equalsIgnoreCase("a") 는 true
				// "A".equals("a")는 false 이다.
				break; // 만약 입력된 문자열이 "q"와 같으면 반복문 종료
			}

			// 숫자나 q 를 제외한 값이 입력될 경우 예외처리
			try {
				// 여기서 입력받은 값을 숫자로 변환(예외 발생시 catch문으로)
				double value = Double.parseDouble(input); // 문자열숫자를 실수로 파싱
				numbers.add(value);// 입력한 실수를 리스트에 저장
				total += value;
			} catch (NumberFormatException e) {
				//예외발생 실수를 변환할 때 예외
				System.out.println("숫자가 아닙니다");
				//continue; // 반복문에서 컨티뉴 아래 코드는 실행하지 않고 반복문 조건으로 돌아감, 여기서는 없어도 됨
			}

		}

		scan.close();

		System.out.println();

		if (numbers.size() > 0) { // 입력된 실수가 있다.

			System.out.println("입력된 숫자 : ");

			Collections.sort(numbers);// 정렬

			for (Double number : numbers) {
				System.out.printf("%.2f\n", number);
			}

			System.out.printf("평 균 값 : %.2f\n", total / numbers.size());// 전체값/리스트갯수
		} else
			System.out.println("숫자가 입력되지 않음!");

	}

}
