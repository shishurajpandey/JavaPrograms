package package1;
class DefaultClass{
	private int pubNum = 4;
	private int priNum = 5;
	protected int proNum = 6;
	int defNum = 7;
	
	
	public int getpubNum(){
		return pubNum;
	}
	
	public void setpubNum(int j){
		
		pubNum = j;
	}
}
public class TestPublic1 {
	public int pubNum = 4;
	private int priNum = 5;
	protected int proNum = 6;
	int defNum = 7;
	
	
	void method1(){
		
		System.out.println(priNum);
	}
	
	
}


