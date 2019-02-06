package telusko_mar_2018;

public class StaticBlock {

	private static int x=6;
	static {
		System.out.println("I am from Static block");
		int y=5;
	}
	public static void main(String[] args) {
		
       System.out.println("I am from main Block");
       System.out.println(StaticBlock.x);
       
       StaticBlock st=new StaticBlock();
       //You can't access variable from static block here
       
	}

}
