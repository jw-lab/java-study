package class_exam.reference;

public class PointTest {

	public static void main(String[] args) {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(3, 4);
		
		double dist = Point.distance(p1, p2);
		
		System.out.printf("�� �� A%s, B%s ������ �Ÿ�: %.2f",p1.toString(),p2.toString(),dist);
		
	}

}
