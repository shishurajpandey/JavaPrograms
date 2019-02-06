package telusko_mar_2018;

public class AnyonumusObject {

	public static void main(String[] args) {
		//To create Anyonomous Object
		//Creating object without refernce is known as anyonomus object., Here no stack memory will be used and it is created if you have to use object
		//only one times after that it will be available for garbage collections.
	
		new M().x=5;
		new M().show();

	}
}

class M
{
	public int x;
	public void show()
	{
		System.out.println("Show");
	}
}
