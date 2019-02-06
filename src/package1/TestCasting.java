package package1;

class ClassA1{
	
	public void method1(){
		System.out.println("ClassA1 method1");
	}
}

class ClassB1 extends ClassA1{
	
	public void method2(){
		System.out.println("ClassB1 method1");
	}
	
}

class ClassC1 extends ClassB1{
	public void method3(){
		System.out.println("ClassC1 method1");
	}
}

//class ClassD1 {
//	
//	public ClassC1 method4(){
//		return new ClassC1();
//	}
//}
public class TestCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		///ClassC1 c1 = new ClassC1();
		 ClassA1 a1 = new ClassA1();
		 ClassA1 a2 = new ClassB1();
		 ClassA1 a3 = new ClassC1();
		 
		 a2.method1();
	//	 ClassC1 c3 = new ClassA1();
		 
 //		 ClassC1 c1 = new ClassC1();
		 
	//	 c1 = (ClassC1)a3;
	//	 c2 = (ClassC1)a3;
		 
	}

}
