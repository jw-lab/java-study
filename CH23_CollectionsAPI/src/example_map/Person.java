package example_map;

import java.util.Objects;

public class Person implements Comparable<Person> {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	
	@Override
	public String toString() {
		return name;
	}

	//중복되는 key를 name을 기준으로 설정하였음
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name);
	}


	//TreeMap의 정렬을 위한 Comparable 인터페이스 구현
	@Override
	public int compareTo(Person o) {
		//this name과 other name 비교
		return name.compareTo(o.name);//name으로 비교
	}
	
	
}
