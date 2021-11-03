package customHashset;

import java.util.HashSet;

public class App {

	public static void main(String[] args) {
		// 커스텀 클래스 Creature에서 equals, hashcode 오버라이드
		HashSet<Creature> cretures = new HashSet<>();
		
		//셋 형에서 중복의 비교는 객체의 equals 메소드를 사용해 같으면 제외
		
		//기본 equals 메소드는 Object클래스를 상속받아 사용하므로 객체가 같은지를 비교
		//셋은 중복을 허용하지 않으므로 equals메소드를 사용하는데 이를 오버라이드하여 커스텀하게 사용가능
		cretures.add(new Creature(0, "고양이"));
		cretures.add(new Creature(1, "개"));
		cretures.add(new Creature(2, "돼지"));
		cretures.add(new Creature(2, "돼지"));
		cretures.add(new Creature(3, "소"));
		cretures.add(new Creature(4, "말"));
		cretures.add(new Creature(4, "비둘기"));//id가 같으므로 입력 안됨
		
		System.out.println(cretures.contains(new Creature(0, "야옹이")));//새로운 다른 객체이지만 id가 같으므로 true
		
		cretures.forEach(System.out::println);
	}

}
