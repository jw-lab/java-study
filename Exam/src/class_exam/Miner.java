package class_exam;

public class Miner {
	private String name;
	private int coins;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCoins() {
		return coins;
	}

	public void setCoins(int coins) {
		this.coins = coins;
	}

	public Miner(String name) {
		this.name = name;
		this.coins = 0;
	}
	
	public void mine() {
		coins += 1;
	}

	@Override
	public String toString() {
		return "Miner {name: " + name + ", coins: " + coins + "}";
	}
}
