package interface_inheritance;

public interface DefaultRunnable extends Runnable {
	default void displayDetails() {
		System.out.println("ǥ���� ������ ����");
	};
}
