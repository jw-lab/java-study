package class_exam;

public class ItemTest {

	public static void main(String[] args) {
		Item[] items = new Item[4];
		for(int i=0;i<items.length;i++)
			items[i] = new Item();
		
		items[0].setName("스톰 브레이커");
		items[0].setPower(600);
		items[1].setName("인피니티 건틀렛");
		items[1].setPower(999);
		items[2].setName("호크아이의 활");
		items[2].setPower(50);
		items[3].setName("캡틴아메리카의 방패");
		items[3].setPower(50);
		
		for(int i=0;i<items.length;i++)
			System.out.println(items[i].toString());

	}

}
