package application;

public class BooleanOr {

	public static void main(String[] args) {
		// == , !=, !, &&, ||
		
		boolean isRaining = true;	//비가 오는가?
		boolean mightRain = false;	//비가 올 수도 있는가?
		boolean takeUmbrella = false;	//우산을 쓰나?
		
		takeUmbrella = isRaining || mightRain;
		
		System.out.println(takeUmbrella);
		

		
	}

}
