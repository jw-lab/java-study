package test;

public class Ternarycondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min=1000;
		int[] values = {6,3,92,64,17};
		
		for(int value : values)
			min = min > value ? value : min;
			System.out.println(min);
	}

}
