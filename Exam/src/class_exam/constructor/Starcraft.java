package class_exam.constructor;

public class Starcraft {

	public static void main(String[] args) {
		Marine marine = new Marine("¸¶¸°",80);
		Medic medic = new Medic("¸Þµñ",60);
		
		//¸¶¸° ½ºÆÀÆÑ
		marine.stimpack();
		
		//¸Þµñ Ä¡·á -> ¸¶¸°
		medic.heal(marine);
	}

}
