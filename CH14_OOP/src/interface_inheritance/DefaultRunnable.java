package interface_inheritance;

public interface DefaultRunnable extends Runnable {
	default void displayDetails() {
		System.out.println("표시할 디테일 없음");
	};
}
