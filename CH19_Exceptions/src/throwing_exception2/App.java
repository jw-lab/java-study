package throwing_exception2;

public class App {

	public static void main(String[] args) {
		// ����ó���� �ѱ�
		Thermostat stat = new Thermostat();
		
		//setTemperature �޼ҵ忡�� ����ó���� throw�߱� ������ ȣ���� �� ó���ؾ� �Ѵ�.
		//try-catch�� �ٷ� ó��, throw�� �ѱ�
		//������ ���� �߻���
		try {
			stat.setTemperature(60);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); //���� �߻� ��ġ ����
			System.out.println(e.getMessage()); //���� �޼��� ���
		}

	}

}
