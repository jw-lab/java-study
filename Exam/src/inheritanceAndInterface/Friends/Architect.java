package inheritanceAndInterface.Friends;

public class Architect implements Friend {
	private String name;
	
	
	public Architect(String name) {
		this.name = name;
	}


	@Override
	public void dearFriend() {
		System.out.printf("%s->칭구 아이가!\n",name);
		
	}

}
