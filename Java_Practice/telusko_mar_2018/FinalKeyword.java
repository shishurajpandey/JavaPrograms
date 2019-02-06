package telusko_mar_2018;

public class FinalKeyword {

	
	
	public static void main(String[] args) {
	final int x=5; //If you are defining any variable as final, then you can assign it value once in the whole program and it won't change.
	// x=7; change of final variable value not allowed
	//If you are defining any variable as static then you it will have the single copy which will be shared among all the instance of that class.
	}

}

class AXP{

	//If you are defining any method as final then you won't able to override that method.
	public final void sum()
	{
		System.out.println("In A");
	}
}

class B extends AXP{
	
	
	//Overiding final method not allowed
	/*public void sum()
	{
		
	}*/
}

//If you are defining any class as final then you won't able to extend that class or inherit that class using extend keyword.
final class c{
	
	public c()
	{
		
	}
}

