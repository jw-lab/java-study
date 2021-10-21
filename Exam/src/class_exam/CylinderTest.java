package class_exam;

public class CylinderTest {

	public static void main(String[] args) {
		Cylinder cyl = new Cylinder();
		cyl.setRadius(4);
		cyl.setHeight(5);
		double r = cyl.getRadius();
		double h = cyl.getHeight();
		
		double vol = cyl.getVolume(r, h);
		double area = cyl.getArea(r, h);
		
		System.out.printf("¿ø±âµÕÀÇ ºÎÇÇ: %.2f\n",vol);

		System.out.printf("¿ø±âµÕÀÇ °Ñ³ĞÀÌ: %.2f\n",area);

	}

}
