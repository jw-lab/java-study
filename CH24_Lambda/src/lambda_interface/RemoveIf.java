package lambda_interface;

import java.util.ArrayList;
import java.util.List;

public class RemoveIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<>();
		numbers.add(3);
		numbers.add(5);
		numbers.add(7);
		numbers.add(2);
		numbers.add(9);
		numbers.add(10);
		numbers.add(4);
		
		//6보다 작다면 제거
		//numbers.removeIf(n->{return n<6;}); 아래와 동일한 동작
		numbers.removeIf(n->n<6);//매개변수 n(integer), return n<6; --true or false
		

		numbers.forEach(t->System.out.println(t));
		
	}

}
