package telusko_june_2018;

public class Constructors {
	
	public static void main(String [] args) {
	
		A a=new A();
		A b=new A(1);
		A c=new A(2, 3);
		
	}
	

}

class A{
	
	public A() {
	System.out.println("I am in A default Constructor");	
	}
	
	public A(int k)
	{
		System.out.println("I am in default constructor with K");
	}
	
	public A(int x, int y)
	{
		System.out.println("dEFAUL With X AND Y");
	}
}
