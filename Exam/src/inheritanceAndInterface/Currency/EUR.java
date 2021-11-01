package inheritanceAndInterface.Currency;

public class EUR extends Currency{

	public EUR(double amount, String notation) {
		super(amount, notation);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return String.format("EUR: %.2f %s", amount,notation);
	}
}
