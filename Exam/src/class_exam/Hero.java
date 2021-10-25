package class_exam;

import java.util.Random;

public class Hero {
	private String name;
	private int hp;
	Random rand = new Random();
	
	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	public void punch(Hero enemy) {
		int damage = rand.nextInt(10)+1;
		enemy.hp -= damage;
	}

	public static void battle(Hero a, Hero b) {
		boolean attack = true; //attack이 참이면 a가 펀치를 날린다.
		while(a.hp>0 && b.hp>0) {
			if(attack) {
				a.punch(b);
				System.out.printf("[%s]의 펀치\n",a.name);
				System.out.printf("%s: %d/30\n",b.name,b.hp);
			} else {
				b.punch(a);
				System.out.printf("[%s]의 펀치\n",b.name);
				System.out.printf("%s: %d/30\n",a.name,a.hp);
			}
			
			attack = !attack;
		}
		
	}
	
}
