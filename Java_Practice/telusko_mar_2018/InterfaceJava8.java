package telusko_mar_2018;


//From Java 8 onwards, Interface can have methods declaration and definition in it, Provided they have been using default keyword
interface am{

	default void sum()
	{
		System.out.println("Hello-a");
	}
}

//From Java-8 Onwards interfaces can also have static methods in it.
interface bn{

	default void sum()
	{
		System.out.println("Hello-a");
	}
	
	//Static method defined in Interface.
	static void sub()
	{
		System.out.println("Sub in interface b");
	}
	
}

//To solve the diamond problem in case of default method, We have to overide the common method in our class implementing
// the above interface.
class Cp implements am,bn{
	
	public void sum() {
System.out.println("Class-C");	
	}
	
}
public class InterfaceJava8 {

	public static void main(String[] args) {
		
		Cp c=new Cp();
		c.sum();
	
		
	}

}
