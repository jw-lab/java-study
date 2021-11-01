package inheritanceAndInterface.Friends;

public class Lawyer implements Friend {
	private String name;
	
	
	public Lawyer(String name) {
		this.name = name;
	}


	@Override
	public void dearFriend() {
		System.out.printf("%s->칭구 아이가!\n",name);
		
	}

}
