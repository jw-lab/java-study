package class_exam.constructor;

public class Medic {
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


	public Medic(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}


	public void heal(Marine target) {
		System.out.printf("[%s]의 치유! %s HP(%d ->",name,target.getName(),target.getHp());
		target.setHp(target.getHp()+10);
		System.out.printf("%d)\n",target.getHp());
	}

}
