package class_exam;

public class FoodTest {

	public static void main(String[] args) {
		Food[] food = new Food[3];
		for(int i=0;i<food.length;i++)
			food[i] = new Food();
		
		food[0].setName("치킨");
		food[0].setPrice(18000);
		food[1].setName("피자");
		food[1].setPrice(28000);
		food[2].setName("초밥세트");
		food[2].setPrice(22000);
		
		for(int i=0;i<food.length;i++)
			System.out.println(food[i].toString());


		
	}

}
