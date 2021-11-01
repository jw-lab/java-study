package inheritanceAndInterface.Wizard;

public class Wizard extends Novice {
	protected int mp;

	public Wizard(String name, int hp, int mp) {
		super(name, hp);
		this.mp = mp;
	}
	
	public void energyVolt() {
		System.out.printf("%s의 에너지볼트!\n", this.name);
	}
}
