package inheritanceAndInterface.Taxi;

public interface Meter {
	int BASE_FARE = 3000;//기본요금(인터페이스에 정의한 변수는 상수라서 변경할 수 없다)
	void start();
	void stop(int distance);
	
}
