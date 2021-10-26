package game.objects;

public enum GameObject {

	가위,바위,보;
	
	private int[][] comparison = {
			//행: 나, 열:상대
			//			가위		바위		보
			/*가위*/ {	 0,		-1,		1	},
			/*바위*/ {	 1,		 0,	   -1	},
			/*보*/ 	{	-1,		 1,		0	}
	};
	public int compare(GameObject ob) {
		return comparison[this.ordinal()][ob.ordinal()];
	}
	
}
