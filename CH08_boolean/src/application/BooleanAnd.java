package application;

public class BooleanAnd {

	public static void main(String[] args) {
		// == , !=, !, &&, ||
		
		boolean isRaining = false;	//비가 오는가?
		boolean haveUmbrella = true;	//우산이 있는가?
		boolean takeUmbrella = false;	//우산을 쓰나?
		
		
		//비가 오고 우산이 있으면 우산을 쓴다.
		if(isRaining && haveUmbrella) {
			takeUmbrella = true;
		}
		
		System.out.println("첫번째 경우 : " + takeUmbrella);
		
		takeUmbrella = isRaining && haveUmbrella ?true:false;
		System.out.println("마지막 경우 : " + takeUmbrella);
		
	}

}
