package list_interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Timing_list {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		//클래스 가져올때 단축키: Ctrl+Shift+o
		long duration = timeOperation(linkedList);

		System.out.println("측정시간 : " + duration);
		//그냥 순서대로 추가할때 어레이리스트가 링크드보다 5배이상 빠르다.
		//특정 위치에 추가 또는 제거할 때 링크드 리스트가 10배는 빠르다.
	}

	private static long timeOperation(List<Integer> list) {
		long start = System.currentTimeMillis(); //현재 시간을 1/1000초 단위로 측정
		
		for(int i=0;i<100000;i++)
			list.add(0,i);//10만번 add 메소드 반복
		
		return System.currentTimeMillis()-start; //메소드 종료시간-시작시간=>for문 반복시간
	}

}
