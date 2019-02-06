package telusko_java;


interface X{
 void a();
 default void show()
 {
	 System.out.println("show in X Default");
 }
	
 static void staticM()
 {
	 System.out.println("Static in A");
 }
 
}

interface Y{
	 void b();
	 default void show()
	 {
		 System.out.println("show in Y Default");
	 }	
	}
public class InterfaceJava8 implements X, Y{

	public static void main(String[] args) {
		X.staticM();

	}

	@Override
	public void a() {
	}

	@Override
	public void b() {		
	}

	@Override
	public void show() {
	
		//Y.super.show();
System.out.println("Hello in Show C");
	}

	
}
