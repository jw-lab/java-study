package java_api;

public class CartTest {

	public static void main(String[] args) {
		// 구매상품 객체 생성
		CartItem[] items = new CartItem[3];
		items[0]= new CartItem("스트라이프 셔츠", 49900);
		items[1]= new CartItem("슬림 면바지", 58900);
		items[2]= new CartItem("스니커즈", 46900);
		
		//장바구니에 상품 담기
		Cart mycart = new Cart();
		for(CartItem item: items )
			mycart.add(item);
		
		//총합 출력
		System.out.printf("총합: %d원\n", mycart.totalPrice());
	}

}
