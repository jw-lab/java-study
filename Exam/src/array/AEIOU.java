package array;

public class AEIOU {

	public static void main(String[] args) {
		// 문자열 변수 생성
		String s = "Programming is fun! right?";
		
		// 자음 모음 갯수 세기
		int[] result = count(s);
		
		// 결과 출력
		System.out.printf("%s\n=> 자음 %d개, 모음 %d개",s,result[0],result[1]);

	}

	private static int[] count(String s) {
		int conso = 0; //자음
		int vowel = 0; //모음
		
		
		//문자열을 문자들의 배열로 만들기 ->스트링.toCharArray()
		//{'P','R','O','G'.....}
		char[] characters = s.toUpperCase().toCharArray();// 대문자로 바꾼뒤 배열로
		
		//모든 문자 배열을 순회하며 검사
		for(int i=0;i<characters.length;i++) {
			switch(characters[i]) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				vowel++;
				break;
				
			//공백 및 특수 문자 제외
			case ' ':	//스페이스
			case '\t':	//탭
			case '\n':	//엔터
			case ',':	//콤마
			case '.':	//닷
			case '?':	//물음표
			case '!':	//느낌표
				break;
			
			//그 외(자음)
			default:
				conso++;
				break;
			}
		}
		return new int[] {conso, vowel};
	}

}
