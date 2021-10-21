package method;

public class JavaCafe {

	public static void main(String[] args) {
		printPay(10.00,40);
		printPay(10.00,50);
		printPay(7.50,38);
		printPay(8.50,66);
	}

	private static void printPay(double basePay, int hours) {
		double pay = 0.0;
		if(hours>60) {
			System.out.println("�ʰ� �ٹ��ð� ����!");
			return ;
		}
		else if(hours>40 && basePay>=8.0)
			pay=basePay*(hours-40)*1.5+basePay*40;
		else if(hours<=40 && basePay>=8.0)
			pay = basePay*hours;
		else {	
			System.out.println("���� �ñ� ����!");
			return ;
		}
		 
		System.out.printf("$ %.2f\n",pay);
	}

}
