package telusko_mar_2018;

public class PolymorphismEg {

	public static void main(String[] args) {
		Ab ab=new Ab();
		ab.sum();
		ab.sum(5);
		cd cd=new cd();
		cd.sum();
	    //Example of Polymorphism, When the refernce of parent class is used to create the object of child class.
		Ab a=new cd();
		a.sum(); 
		//Run time polymorphism, Here the refernce  of A is used to call the method of B. Which method to be called is decided
		//at run time hence run time polymorphism or dynamic biniding.	
       
	}
	

}

class Ab{
	
	int x=6;
	int y=7;
	
	public void sum()
	{
		System.out.println(x+y);
	}
	
	//Example of methhod overloading, Method having the same name and but different parameter 
	
	public void sum(int z)
	{
		System.out.println(x+y+z);
	}
	
	
}

class cd extends Ab{
	
	//Method Overriding, When you overide the method present in Base class to child class. That means class having the same name and same no of parameter.
	@Override
	public void sum()
	{
		System.out.println(x*y);
	}
	
}