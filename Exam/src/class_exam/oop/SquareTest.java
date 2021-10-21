package class_exam.oop;

public class SquareTest {

	public static void main(String[] args) {
		Square s = new Square();
		
		s.setLength(4);
		
		System.out.printf("한 변의 길이가 %d인 정사각형의 넓이: %d",s.getLength(),s.area());
		
	}

}
