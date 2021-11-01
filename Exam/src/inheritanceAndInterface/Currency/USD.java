package inheritanceAndInterface.Currency;

public class USD extends Currency {

	public USD(double amount, String notation) {
		super(amount, notation);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return String.format("USD: %.2f %s", amount,notation);
	}
}
