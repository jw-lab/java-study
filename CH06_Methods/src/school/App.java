package school;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student();
		Student st2 = new Student("���",7,false,36.5);
		Student st3 = new Student("�浿",37,true,35.5);
		Student st4 = new Student("���̾�",17,false,37.5);
		
		st1.setName("������");
		st1.setAge(27);
		st1.setVisible(false);
		st1.setTemperature(34.5);
		
		System.out.println(st1.toString());

		System.out.println(st2.toString());
		System.out.println(st3.toString());
		System.out.println(st4.toString());
	}

}
