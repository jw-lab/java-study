package inheritanceAndInterface.Wizard;

public class WizardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreatWizard gandalf = new GreatWizard("간달프",100, 100, 100);
		
		//상태 출력
		System.out.println(gandalf.toString());
				
		//에너지볼트
		gandalf.energyVolt();
	}

}
