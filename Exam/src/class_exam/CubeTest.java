package class_exam;

public class CubeTest {

	public static void main(String[] args) {
		Cube[] cubes = new Cube[2];
		cubes[0] = new Cube(3,"a");
		cubes[1] = new Cube(5,"b");
		for(int i=0;i<2;i++)
			System.out.println(cubes[i].toString());
		
//		int[] volumes = new int[2];
//		int[] surfaces = new int[2];
//		
//		for(int i=0;i<2;i++) {
//			volumes[i] = cubes[i].getVolume();
//			surfaces[i] = cubes[i].getSurface();
//		}

	}

}
