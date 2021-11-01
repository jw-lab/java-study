package inheritanceAndInterface.Drink;

public class DringTest {

	public static void main(String[] args) {
		// 객체 생성
		Drink[] drinks = new Drink[5];
		drinks[0] = new Juice();
		drinks[1] = new Coffee();
		drinks[2] = new Beer();
		drinks[3] = new Water();
		drinks[4] = new Tea();
		
		//모든 음료를 주문
		for(Drink d: drinks)
			d.ordered();

	}

}
