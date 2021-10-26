package custom_exception;

import custom_exception.exceptions.TempOutOfRangeException;
import custom_exception.exceptions.TempTooHighException;
import custom_exception.exceptions.TempTooLowException;

public class App {

	public static void main(String[] args) {

		Thermostat stat = new Thermostat();

		try {
			stat.setTemperature(22);
		} catch (TempTooHighException e) {
			System.out.println(e.getMessage()); //예외 메세지 출력
		} catch (TempTooLowException e) {
			System.out.println(e.getMessage());
		}

	}

}
