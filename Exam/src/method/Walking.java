package method;

public class Walking {

	public static void main(String[] args) {
		double result = calc(5000);
		System.out.println(result+" kcal");
	}

	private static double calc(int walk) {
		return 0.02 * walk;
	}

}
