package inheritanceAndInterface.Currency;

public class KRW extends Currency{

	public KRW(double amount, String notation) {
		super(amount, notation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return String.format("KRW: %.2f %s", amount,notation);
	}

	
}
