package class_exam;

public class OrderChinaFood {

	public static void main(String[] args) {
		Order[] orders = new Order[3];
		for(int i=0;i<orders.length;i++)
			orders[i] = new Order();
		
		orders[0].setMenu("¥��");
		orders[0].setPrice(4900);
		orders[1].setMenu("«��");
		orders[1].setPrice(5900);
		orders[2].setMenu("������");
		orders[2].setPrice(13900);
		
		int result = 0;
		for(int i=0;i<orders.length;i++)
			result += orders[i].getPrice();
		
		System.out.printf("�ֹ� �հ�: %d��\n", result);

	}

}
