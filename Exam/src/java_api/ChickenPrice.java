package java_api;

import java.util.ArrayList;

public class ChickenPrice {

	public static void main(String[] args) {
		// ArrayList 생성
		ArrayList<Chicken> order = new ArrayList<>();
		
		//주문한 치킨을 추가
		order.add(new Chicken("로스트",9900));
		order.add(new Chicken("파닭",12900));
		order.add(new Chicken("마늘아",13900));
		
		//ArrayList를 순회하여 총합 구하기
		int sum=0;
		for(Chicken c : order)
			sum += c.getPrice();
		
		System.out.printf("총합: %d원\n",sum);

	}

}
