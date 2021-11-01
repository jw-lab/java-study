package inheritanceAndInterface.Car;

public class CarTest {

	public static void main(String[] args) {
		// 객체 생성
		Car[] cars = new Car[2];
		cars[0] = new Car("티코");
		cars[1] = new Truck("봉고",1.5);
		
		//정보출력
		System.out.println(cars[0].toString());
		System.out.println(cars[1].toString());

	}

}
