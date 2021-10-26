package class_exam;

public class MinerTest {

	public static void main(String[] args) {
		Miner[] miner =new Miner[2];
		miner[0]= new Miner("말런");
		miner[1]= new Miner("글로리아");
		
		for(int i=0;i<3;i++)
			miner[0].mine();
		for(int i=0;i<2;i++)
			miner[1].mine();
		
		for(int i=0;i<2;i++)
			System.out.println(miner[i].toString());

	}

}
