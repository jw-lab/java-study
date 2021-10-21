package class_exam;

public class Cylinder {
	private double radius;
	private double height;
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getArea(double r,double h) {
		return 2*Math.PI*r*r + 2*Math.PI*r*h;
	}
	
	public double getVolume(double r,double h) {
		return Math.PI*r*r*h;
	}

	@Override
	public String toString() {
		return "Cylinder [radius=" + radius + ", height=" + height + "]";
	}
	
	
}
