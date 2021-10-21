package array;

public class DailyUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] users = {581,512,527,495,423,141,236};
		
		//�� ���� ���
		int totalUsers = sum(users);
		System.out.printf("�� �����: %d��\n",totalUsers);
		
		//��� ���� ���
		double dailyUser = avg(totalUsers,users.length);
		System.out.printf("�Ϸ� ��� �����: %.2f��", dailyUser);
	}

	private static double avg(int totalUsers, int length) {
		double avg;
		avg = (double)totalUsers/(double)length;
		return avg;
	}

	private static int sum(int[] users) {
		int sum = 0;
		for(int i=0;i<users.length;i++)
			sum += users[i];
		return sum;
	}

}
