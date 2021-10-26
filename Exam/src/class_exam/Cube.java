package class_exam;

public class Cube {
	private int length;
	private String name;
	
	public Cube(int length,String name) {
		this.length = length;
		this.name = name;
	}

	public int getVolume() {
		// TODO Auto-generated method stub
		return length*length*length;
	}

	public int getSurface() {
		// TODO Auto-generated method stub
		return 6*length*length;
	}

	@Override
	public String toString() {
		return "정육면체 " + name + "의 부피: " + getVolume() + ", 겉넓이:" +getSurface();
	}

	
	
}
