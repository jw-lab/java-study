package method;

public class Pork {

	public static void main(String[] args) {
		int weight = 180;
		double kCal = 5.179;
		
		double result=calc(weight,kCal);
		
		System.out.printf("���� 3�κ�: %.2f kcal", result);
	}

	private static double calc(int weight, double kCal) {
		return weight*3*kCal;
	}

}
