package hashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class OrderedMap {

	public static void main(String[] args) {
		// 순서없음,  순서있음(입력된 순서대로), 정렬됨
		// HashSet,  LinkedHashSet,      TreeSet
		// HashMap,  LinkedHashMap,      TreeMap
		
		Map<Integer, String> months1 = new LinkedHashMap<>();
		
		months1.put(1, "1월");
		months1.put(3, "3월");
		months1.put(6, "6월");
		
		months1.forEach((k,v)->{
			System.out.println(k+":"+v);
		});
		System.out.println();
		
		Map<Integer, String> months2 = new TreeMap<>();
		
		months2.put(3, "3월");
		months2.put(6, "6월");
		months2.put(1, "1월");
		
		months2.forEach((k,v)->{
			System.out.println(k+":"+v);
		});
		System.out.println();

	}

}
