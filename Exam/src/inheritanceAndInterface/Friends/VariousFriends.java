package inheritanceAndInterface.Friends;

public class VariousFriends {

	public static void main(String[] args) {
		// 객체 생성
		Friend[] friends = new Friend[4];
		friends[0] = new Artist("뮤지션 김씨");
		friends[1] = new Architect("건축가 이씨");
		friends[2] = new Developer("개발자 박씨");
		friends[3] = new Lawyer("변호사 최씨");
		
		for(Friend f: friends)
			f.dearFriend();
	}

}
