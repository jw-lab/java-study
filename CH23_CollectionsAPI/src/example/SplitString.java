package example;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "Hello; how are you? It is very windy/rainy today! George's feet are cold.";
		//String[] words = text1.split("[^a-zA-Z]+");//영문자를 제외한 문자 1개이상을 기준으로 split
		
		String text2 ="1안은 2050년 예상 순배출량이 2540만t으로 가장 높은데, 2018년 대비 96.3%가 줄어든다.";
		
		String[] words = text2.split("[^가-힣]+"); //한글을 제외한 문자 1개 이상을 기준으로 split
		
		for(String w : words) {
			
			if(w.length()<2)//split된 문자중 길이가 2보다 작으면 출력하지 않음
				continue;
			
			System.out.println(w.toLowerCase());//소문자로 출력
		}
	}

}
