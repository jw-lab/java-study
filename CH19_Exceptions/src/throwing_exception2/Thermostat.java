package throwing_exception2;

public class Thermostat {
	public void setTemperature(double temperature) throws Exception {
		
		setMachineTemperature(temperature); //--�� ��° ���ܹ߻���(���� �޼ҵ带 ȣ���Ͽ����Ƿ�)
		System.out.println("�µ� ���� : " +temperature);//�µ��� ������ ��� ���
	}

	private void setMachineTemperature(double temperature) throws Exception {
		if(temperature < 0 || temperature >35) {
			//�µ����� ���������� ���⼭ ����ó���Ѵ�. throw�� �ϴ� ���ܸ� ���߿� ó��(�� �޼ҵ带 ȣ���Ҷ� ó��)
			throw new Exception("�µ��� ������ �Դϴ�.");//���ܸ� ���� --ù ��° ���ܹ߻���
		}
		
	}
}
