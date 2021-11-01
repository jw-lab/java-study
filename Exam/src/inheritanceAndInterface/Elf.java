package inheritanceAndInterface;

public class Elf {
	protected String name;
	protected int hp;
	
	public Elf(String name, int hp) {

		this.name = name;
		this.hp = hp;
	}

	@Override
	public String toString() {
		return "[엘프] Name: " + name + ", HP: " + hp;
	}
	
	
}
