package java_api;

import java.util.ArrayList;

public class Cart {
	private ArrayList<CartItem> list;
	
	public Cart() {
		this.list = new ArrayList<>();
	}
	
	//장바구니 물품 추가 메소드
	public void add(CartItem item) {
		list.add(item);
	}
	
	//장바구니 총합 메소드
	public int totalPrice() {
		int sum=0;
		for(CartItem item : list)
			sum += item.getPrice();
		return sum;
	}
}
