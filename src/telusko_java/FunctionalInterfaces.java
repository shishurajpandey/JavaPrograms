package telusko_java;


/*Types of Interfaces-

1. Marker Interface- Marker interface is an interface with no fields and methods in it. It is used to convey the message to JVM that, the class
which is implenting it will have some special behaviour. Hence an empty interface in java is called Marker interface.
2. SAM Interface(Single Abstract method Interface)- this is an interface having single abstract method and can be expressed using 
Anonyoms class, Also known as functional interface
3. Normal Interface- It is a normal Interface.


--By default all method will be abstract and public in Interface
*/

interface Animal
{
	void input();
}
 
 interface cat extends Animal {
	   public void eat();
	   
	}

public class FunctionalInterfaces implements Animal,cat {
	public static void main(String[] args) {

		FunctionalInterfaces f=new FunctionalInterfaces();
		f.eat();
		f.input();
		f.hat();
	}

	@Override
	public void eat() {
		System.out.println("Eat");
	}
		private void hat()
		{
			System.out.println("Hat");
		}
		
	


	@Override
	public void input() {
		System.out.println("Input");
		
	}

	

}
