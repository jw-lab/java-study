package class_exam;

public class AccountTest {

	public static void main(String[] args) {
		Account a = new Account("123-45",10000);
		Account b = new Account("567-89",10000);
		
		boolean result = true;
		
		while(result){
			result = a.transfer(b,3000);
		};
		
		System.out.println(a.toString());
		System.out.println(b.toString());
	}

}
