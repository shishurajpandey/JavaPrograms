package interviewQuestions;

public class SingeltonClassInJava {
		
	public static void main(String[] args) {
		
		Singelton s1=Singelton.getInstance();
		s1.str=s1.str.toUpperCase();
		System.out.println();
		
		Singelton s2=Singelton.getInstance();
		System.out.println(s2.str);
	}

}


class Singelton {
	
	
	  private static Singelton sing=null;
	  String str="Hello how are you";
	
	// Singelton Class is a type of class in Java, For which only one Object can be created. 
	// To implement singelton class you have to make the constructor of that class private 
	// And create a public getInstance() method which will return the object of that class
	
	
	private Singelton()
	{
		System.out.println("Singelton Class Instance was called");
	}
	
	
	public static Singelton getInstance()
	{
		if(sing==null)
		   {
			sing=new Singelton();
		   }
		   
		return sing;
		
	}
}