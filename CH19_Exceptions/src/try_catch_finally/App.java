package try_catch_finally;

public class App {

	public static void main(String[] args) {
		Person p1 = new Person();
		
		try {
			p1.setName("펭수");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			System.out.println("무조건 실행");
		}
		
		System.out.println("프로그램 종료");

	}

}
