package class_exam.constructor;

public class Marine {

	private String name;
	private int hp;
	
	
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


	public Marine(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}


	public void stimpack() {
		System.out.printf("[%s]ÀÇ ½ºÆÀÆÑ: HP: %d ->", name, hp);
		hp -= 10;
		System.out.printf("%d\n",hp);
	}

}
