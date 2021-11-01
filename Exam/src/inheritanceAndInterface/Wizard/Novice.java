package inheritanceAndInterface.Wizard;

public class Novice {
	protected String name;
	protected int hp;
	
	public Novice(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	@Override
	public String toString() {
		return "Novice [name=" + name + ", hp=" + hp + "]";
	}
	
	
}
