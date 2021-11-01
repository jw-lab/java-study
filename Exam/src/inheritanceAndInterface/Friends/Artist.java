package inheritanceAndInterface.Friends;

public class Artist implements Friend {
	private String name;
	
	public Artist(String name) {
		this.name = name;
	}

	@Override
	public void dearFriend() {
		System.out.printf("%s->칭구 아이가!\n",name);
		
	}

}
