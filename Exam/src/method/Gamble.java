package method;

public class Gamble {

	public static void main(String[] args) {
		double dollar = dice()+dice()+dice();
		double won = exchange(dollar);
		System.out.printf("ȹ�� �ݾ� $%.2f(%.0f��)",dollar,won);
	}

	private static double exchange(double dollar) {
		// TODO Auto-generated method stub
		return dollar*1082.25108;
	}

	private static int dice() {
		return (int)(Math.random()*(6-1))+1;
	}

}
