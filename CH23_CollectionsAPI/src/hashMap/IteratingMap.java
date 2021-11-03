package hashMap;

import java.util.HashMap;
import java.util.Map;

public class IteratingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> months = new HashMap<>();
		
		months.put("JAN", "1월");
		months.put("FEB", "2월");
		months.put("MAR", "3월");
		months.put("APR", "4월");
		months.put("MAY", "5월");
		months.put("JUN", "6월");
		
		//1. 람다식
		months.forEach((monthCode,monthName)->{
			System.out.println(monthCode+" : "+monthName);
		});
		System.out.println();
		
		//2. entrySet() : key 와 value 모두 가져옴 --for map 구문으로 자동 완성
		for (Map.Entry<String, String> entry : months.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();
			
			System.out.println(key +" : "+ val);			
		}
		
		System.out.println();
		
		//3. keySet():key 를 가져옴
		for(String monthCode : months.keySet()) {
			String monthName = months.get(monthCode);// get(key)메소드로 value를 가져옴
			System.out.println(monthCode+" : "+monthName);
			
		}
	}

}
