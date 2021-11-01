package customHashset;

import java.util.Objects;

public class Creature {
	private int id;
	private String name;
	public Creature(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return id +":"+ name;
	}
	
	//id를 기준으로 같은 객체로 취급하게 한다.
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) { 
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Creature other = (Creature) obj;
		return id == other.id; //객체의 id가 같으면 true 리턴
	}
	
	
}
