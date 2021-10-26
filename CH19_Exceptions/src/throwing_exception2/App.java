package throwing_exception2;

public class App {

	public static void main(String[] args) {
		// 예외처리를 넘김
		Thermostat stat = new Thermostat();
		
		//setTemperature 메소드에서 예외처리를 throw했기 때문에 호출할 때 처리해야 한다.
		//try-catch는 바로 처리, throw는 넘김
		//마지막 예외 발생지
		try {
			stat.setTemperature(60);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); //에러 발생 위치 추적
			System.out.println(e.getMessage()); //예외 메세지 출력
		}

	}

}
