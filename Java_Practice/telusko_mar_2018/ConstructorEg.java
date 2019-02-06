package telusko_mar_2018;

public class ConstructorEg {

	public static void main(String ... args) {
		
		A a=new A();
		A b=new A(5);
		A c=new A(5,3);
	}
}
	
	class A{
		
	/*	private A()
		{
			System.out.println("In Private A");
		}*/
		
		public A()
		{
			System.out.println("In Default Constructor");
		}
		
		public A(int a)
		{
			System.out.println("In A Constructor-1");
		}
		
		public A(int a, int b)
		{
			System.out.println("In A Constructor-2");
		}
	}
