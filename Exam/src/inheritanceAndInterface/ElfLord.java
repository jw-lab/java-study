package inheritanceAndInterface;

public class ElfLord extends HighElf {
	private int shield;

	public ElfLord(String name, int hp, int mp, int shield) {
		super(name, hp, mp);
		this.shield = shield;
	}

	@Override
	public String toString() {
		return "[엘프로드] Name: " + name + ", HP: " + hp +", MP: "+mp+", SH: "+shield;
	}
	
	
}
