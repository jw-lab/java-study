package method;

public class Gasoline {

	public static void main(String[] args) {
		double gasoline = 8.86;
		double distance = 182.736;
		double efficiency = calcEfficiency(gasoline,distance);
		System.out.printf("연비: %.2f km/L", efficiency);
	}

	private static double calcEfficiency(double fuel, double distance) {
		return distance/fuel;
	}

}
