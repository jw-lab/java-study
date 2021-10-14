package windowProgramming;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Window window = new Window();
		window.setWidth(300);
		window.setHeight(500);
		window.setLeft(400);
		window.setTop(200);
		window.setVisible(true);
		System.out.println(window.getWidth());
		System.out.println(window.getHeight());
		System.out.println(window.getLeft());
		System.out.println(window.getTop());
		System.out.println(window.getVisible());
	}

}
