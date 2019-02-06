package telusko_mar_2018;


//Interface is defined same as class with keyword Interface, And they are basically the collection of Abstract Methods.

interface xy{
	void sum();
}


//One Interface can extend another inteface, And can also extend multiple interface.
interface xw extends xy{
	void sub();
}

interface xz extends xy,xw{
	void mul();
}

interface xn{
	 void div();
}

//Class can implement multiple interfaces
class IM implements xz,xn{

	@Override
	public void sum() {
		System.out.println("Sum");
	}

	@Override
	public void sub() {
System.out.println("Subtract");	
	}

	@Override
	public void mul() {
		System.out.println("Multiply");
	}

	@Override
	public void div() {
		System.out.println("Div");
		
	}
	
}

public class InterfaceEg {

	public static void main(String[] args) {
		
		IM eg=new IM();
		eg.sum();
		eg.sub();
		eg.mul();
		eg.div(); 

	}

}
