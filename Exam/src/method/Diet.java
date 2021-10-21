package method;

public class Diet {

	public static void main(String[] args) {
		double weight = 81.6;
		double height = 1.76;
		
		double bmi = calculate(weight,height);
		
		System.out.printf("BMI: %.2f(%.1fkg, %.2fm)",bmi,weight,height);
		System.out.printf("���: %s�Դϴ�.\n",result(bmi));
	}

	private static String result(double bmi) {
		if(bmi>=30)
			return "��";
		else if(bmi>=25)
			return "��ü��";
		else if(bmi>=18.5)
			return "����";
		else
			return "��ü��";
	}

	private static double calculate(double w, double t) {
		return w/(t*t);
	}

}
