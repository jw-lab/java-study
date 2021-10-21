package abstract_Class;

public class App {

	public static void main(String[] args) {
		GameObject[] objs = new GameObject[2];
		objs[0] = new Player();
		objs[1] = new Monster();
		
		for(GameObject obj : objs) {
			System.out.println(obj);
			obj.describe();
		}
		
	}

}
