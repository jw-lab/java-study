package java_api.sales;

import java.util.ArrayList;

public class TotalSales {

	public static void main(String[] args) {
		// 메뉴 객체 생성
//		Menu[] menus = new Menu[3];
//		menus[0] = new Menu("김밥",2000, 57);
//		menus[1] = new Menu("돈까스",6000, 29);
//		menus[2] = new Menu("냉면",5000, 34);
		ArrayList<Menu> menus = new ArrayList<>();
		menus.add(new Menu("김밥",2000, 57));
		menus.add(new Menu("돈까스",6000, 29));
		menus.add(new Menu("냉면",5000, 34));
		
		//스토어 객체에 메뉴를 추가
		Store store = new Store();
		for(Menu menu:menus)
			store.add(menu);
		
		//하루 총 매출 계산
		System.out.printf("총 매출: %d원\n", store.totalSales());
		

	}

}
