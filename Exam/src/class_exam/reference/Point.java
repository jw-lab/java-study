package class_exam.reference;

public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "("+x+", "+y+")";
	}
	
	public static double distance(Point p, Point q) {
		double dX = p.x - q.x;
		double dY = p.y - q.y;
		return Math.sqrt((dX * dX) + (dY * dY));
	}
	
}
