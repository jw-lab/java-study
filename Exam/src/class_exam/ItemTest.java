package class_exam;

public class ItemTest {

	public static void main(String[] args) {
		Item[] items = new Item[4];
		for(int i=0;i<items.length;i++)
			items[i] = new Item();
		
		items[0].setName("���� �극��Ŀ");
		items[0].setPower(600);
		items[1].setName("���Ǵ�Ƽ ��Ʋ��");
		items[1].setPower(999);
		items[2].setName("ȣũ������ Ȱ");
		items[2].setPower(50);
		items[3].setName("ĸƾ�Ƹ޸�ī�� ����");
		items[3].setPower(50);
		
		for(int i=0;i<items.length;i++)
			System.out.println(items[i].toString());

	}

}
