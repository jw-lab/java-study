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
		
		System.out.printf("원기둥의 부피: %.2f\n",vol);

		System.out.printf("원기둥의 겉넓이: %.2f\n",area);

	}

}
