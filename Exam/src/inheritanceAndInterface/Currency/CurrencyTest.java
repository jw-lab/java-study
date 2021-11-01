package inheritanceAndInterface.Currency;

public class CurrencyTest {

	public static void main(String[] args) {
		// 객체생성

		Currency[] currency = new Currency[4];
		currency[0] = new KRW(1500, "원");
		currency[1] = new USD(100.50, "달러");
		currency[2] = new EUR(260.87, "유로");
		currency[3] = new JPY(1400, "엔");
		
		
		for(Currency c: currency)
			System.out.println(c.toString());
	}

}
