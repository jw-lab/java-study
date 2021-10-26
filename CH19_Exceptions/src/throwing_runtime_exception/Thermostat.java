package throwing_runtime_exception;

public class Thermostat {
	public void setTemperature(double temperature) {
		
		setMachineTemperature(temperature); 
		System.out.println("온도 세팅 : " +temperature);//온도가 정상일 경우 출력
	}

	private void setMachineTemperature(double temperature) {
		if(temperature < 0 || temperature >35) {
			//온도값이 비정상으로 여기서 예외처리한다. throw는 일단 예외를 나중에 처리(이 메소드를 호출할때 처리)
			throw new RuntimeException("온도가 비정상 입니다.");//예외를 생성
		}	//Runtime을 붙이고 throw Exception을 지워도 된다(런타임시에 처리하기 때문에)
			//문법적으로는 문제가 없지만 결국 에러가 발생하게 되므로 처리를 해야 한다.	
		
	}
}
