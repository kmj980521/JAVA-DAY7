class account
{
	private static int counter=0;
	private static int counter2;
	private String name;
	private int id;
	//인스턴스 초기화자
	{
		id=++counter; 
	}
	//정적 초기화자
	static {
		counter2=0;
	}
}
