package class_exam;

public class HeroTest {

	public static void main(String[] args) {
		Hero arthas = new Hero("아서스", 30);
		Hero leona = new Hero("레오나", 30);
		
		Hero.battle(arthas,leona);
	}

}
