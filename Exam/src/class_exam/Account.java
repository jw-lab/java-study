package class_exam;

public class Account {
	private String num;//���¹�ȣ
	private int balance;//�ܾ�
	
	public Account(String num, int balance) {
		this.num = num;
		this.balance = balance;
	}

	public boolean transfer(Account target, int amount) {
		if(balance<amount)
			return false;
		
		balance -= amount;
		target.balance += amount;
		return true;
	}

	@Override
	public String toString() {
		return "Account [num=" + num + ", balance=" + balance + "]";
	}
	
	
}
