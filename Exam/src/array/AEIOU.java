package array;

public class AEIOU {

	public static void main(String[] args) {
		// ���ڿ� ���� ����
		String s = "Programming is fun! right?";
		
		// ���� ���� ���� ����
		int[] result = count(s);
		
		// ��� ���
		System.out.printf("%s\n=> ���� %d��, ���� %d��",s,result[0],result[1]);

	}

	private static int[] count(String s) {
		int conso = 0; //����
		int vowel = 0; //����
		
		
		//���ڿ��� ���ڵ��� �迭�� ����� ->��Ʈ��.toCharArray()
		//{'P','R','O','G'.....}
		char[] characters = s.toUpperCase().toCharArray();// �빮�ڷ� �ٲ۵� �迭��
		
		//��� ���� �迭�� ��ȸ�ϸ� �˻�
		for(int i=0;i<characters.length;i++) {
			switch(characters[i]) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				vowel++;
				break;
				
			//���� �� Ư�� ���� ����
			case ' ':	//�����̽�
			case '\t':	//��
			case '\n':	//����
			case ',':	//�޸�
			case '.':	//��
			case '?':	//����ǥ
			case '!':	//����ǥ
				break;
			
			//�� ��(����)
			default:
				conso++;
				break;
			}
		}
		return new int[] {conso, vowel};
	}

}
