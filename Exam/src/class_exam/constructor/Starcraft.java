package class_exam.constructor;

public class Starcraft {

	public static void main(String[] args) {
		Marine marine = new Marine("����",80);
		Medic medic = new Medic("�޵�",60);
		
		//���� ������
		marine.stimpack();
		
		//�޵� ġ�� -> ����
		medic.heal(marine);
	}

}
