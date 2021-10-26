package method;

public class DatinaApp {

	public static void main(String[] args) {
		// 평가
		String x = rating(4.2,4.7,4.3);
		String y = rating(3.8,4.1,3.5);
		String z = rating(3.6,3.0,3.4);
		
		//출력
		System.out.printf("X -> %s등급\n",x);
		System.out.printf("Y -> %s등급\n",y);
		System.out.printf("Z -> %s등급\n",z);
	}

	private static String rating(double d, double e, double f) {
		String result="";
		double sum = d+e+f;
		if(d>=4.0 && e>=4.0 && f>=4.0)
			result = "A";
		else if(sum>=10 && (d>=4.0 || e>=4.0 || f>=4.0))
			result = "B";
		else
			result = "C";
		return result;
	}

}
