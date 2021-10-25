package method_innerClass;

public class App {
	private String name;
	
	public App() {
		// 기본 생성자
		name = "엘리자베스";
	}
	
	public String getName() {
		return name;
	}
	
	public void run() {
		//System.out.println(name);
		class Printer{
			public void print() {
				System.out.println(name);
				//내부 클래스에서 외부 클래스의 변수 사용가능
			}
		}
		
		new Printer().print();
	}
	
	public static void main(String[] args) {
		// 메소드 안의 클래스
		//System.out.println(name);--에러/ 스태틱 메소드에서는 클래스의 인스턴스 변수와 메소드 사용x
		//스태틱 변수라면 사용 가능
		//위의 변수는 객체(인스턴스)를 생성해야 사용할 수 있다.
		
		App app = new App();
		app.run();
		
	}

}
