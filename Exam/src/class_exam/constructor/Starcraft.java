package class_exam.constructor;

public class Starcraft {

	public static void main(String[] args) {
		Marine marine = new Marine("마린",80);
		Medic medic = new Medic("메딕",60);
		
		//마린 스팀팩
		marine.stimpack();
		
		//메딕 치료 -> 마린
		medic.heal(marine);
	}

}
