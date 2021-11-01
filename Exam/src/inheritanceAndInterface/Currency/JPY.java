package inheritanceAndInterface.Currency;

public class JPY extends Currency {

	public JPY(double amount, String notation) {
		super(amount, notation);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return String.format("JPY: %.2f %s", amount,notation);
	}
}
