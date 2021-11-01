package collections;

public class Wrapper<E> {//E는 자바 콜렉션 타입을 의미
	//객체 생성시 타입을 지정하면 해당 타입으로 변경되어 사용
	//제네릭은 사용타입이 지정되지 않은 클래스, 사용할 때 타입을 지정해서 사용하면 된다.
	private E object;
	
	public void set(E object) {
		this.object = object;
	}
	
	public E get() {
		return object;
	}
	
}
