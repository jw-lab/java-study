package application;

public class BooleanAnd {

	public static void main(String[] args) {
		// == , !=, !, &&, ||
		
		boolean isRaining = false;	//�� ���°�?
		boolean haveUmbrella = true;	//����� �ִ°�?
		boolean takeUmbrella = false;	//����� ����?
		
		
		//�� ���� ����� ������ ����� ����.
		if(isRaining && haveUmbrella) {
			takeUmbrella = true;
		}
		
		System.out.println("ù��° ��� : " + takeUmbrella);
		
		takeUmbrella = isRaining && haveUmbrella ?true:false;
		System.out.println("������ ��� : " + takeUmbrella);
		
	}

}
