package inheritanceAndInterface;

public class ElvesTest {

	public static void main(String[] args) {
		//객체생성
		Elf elf = new Elf("티란데",100);
		HighElf high = new HighElf("말퓨리온",160,100);
		ElfLord lord = new ElfLord("마이에브",230,140,100);
		
		//객체배열 생성
		Elf[] elves = new Elf[3];
		elves[0] = elf;
		elves[1] = high;
		elves[2] = lord;
		
		//모든 객체 정보 출력
		for(int i=0;i<elves.length;i++)
			System.out.println(elves[i].toString());
	}

}
