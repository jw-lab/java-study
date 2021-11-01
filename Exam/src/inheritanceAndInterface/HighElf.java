package inheritanceAndInterface;

public class HighElf extends Elf {
	protected int mp;

	public HighElf(String name, int hp, int mp) {
		super(name, hp);
		this.mp = mp;
	}

	@Override
	public String toString() {
		return "[하이엘프] Name: " + name + ", HP: " + hp +", MP: "+mp;
	}
	
	
}
