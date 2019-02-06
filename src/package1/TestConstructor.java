package package1;

class ClassA{
	
	String strName;
	// Default Constructor 
	 public  ClassA(){
		 System.out.println("Class A default constructor");
		 //System.out.println(strName); 
	 }
	
	 public ClassA(String name){
		 strName = name;
		 System.out.println(strName);
	 }
}

class ClassB extends ClassA{
	
	public ClassB(){
	     super("TechM");
		 System.out.println("Class B default constructor");
	}
	
}

class ClassC extends ClassB{
	public ClassC(){
	
		System.out.println("Class C default constructor");
	}
}

class ClassD {
	int num = 5;
	String name;
	
	 public ClassD (){
		
		System.out.println("Num : " + num + " Name : " + name);
	}
}
public class TestConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  ClassC c1 = new ClassC();
		//ClassD d1 = new ClassD();
	}

}
