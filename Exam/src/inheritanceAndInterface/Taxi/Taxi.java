package inheritanceAndInterface.Taxi;

public class Taxi implements Meter {

	@Override
	public void start() {
		System.out.println("운행을 시작합니다.");
	}

	@Override
	public void stop(int distance) {
		System.out.printf("운행을 종료합니다. 요금은 %d원 입니다.\n",BASE_FARE+distance*2);
	}

}
