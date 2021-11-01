package java_api.sales;

import java.util.ArrayList;

public class Store {
	private ArrayList<Menu> list;
	
	public Store() {
		this.list = new ArrayList<>();
	}
	
	public void add(Menu menu) {
		list.add(menu);
	}
	
	//총 매출 메소드
	public int totalSales() {
		int sum = 0;
		
		for(Menu menu:list)
			sum += menu.getPrice() * menu.getCount();
		return sum;
	}
}
