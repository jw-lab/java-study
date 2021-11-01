package java_api;

public class Knight {
	private String name;
	private int hp;
	
	public Knight() {
		this(null,0);
	}
	public Knight(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	@Override
	public String toString() {
		return "Knight [name=" + name + ", hp=" + hp + "]";
	}
	
	
}
