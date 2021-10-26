package array;

public class DailyUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] users = {581,512,527,495,423,141,236};
		
		//총 유저 계산
		int totalUsers = sum(users);
		System.out.printf("총 사용자: %d명\n",totalUsers);
		
		//평균 유저 계산
		double dailyUser = avg(totalUsers,users.length);
		System.out.printf("하루 평균 사용자: %.2f명", dailyUser);
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
