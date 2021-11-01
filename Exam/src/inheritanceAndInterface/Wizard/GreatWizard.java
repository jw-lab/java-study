package inheritanceAndInterface.Wizard;

public class GreatWizard extends Wizard{
	protected int shield;

	public GreatWizard(String name, int hp, int mp, int shield) {
		super(name, hp, mp);
		this.shield = shield;
	}

	@Override
	public String toString() {
		return String.format("[대마법사] %s(HP: %d, MP:%d, SHIELD: %d)", name,hp,mp, shield);
	}

	@Override
	public void energyVolt() {
		System.out.printf("%s의 에너지볼트!(대마법사 버프로 데미지 +30추가)",name);
	}
	
	
	
}
