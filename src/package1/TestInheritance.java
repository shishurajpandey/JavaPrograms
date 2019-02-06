package package1;
class Parent {
	int num;
	
	public void method1(){
		
		System.out.println("Parent method");
	}
}
class Child extends Parent{
	String name;
	
	public void method2(){
		System.out.println("Child method");
	}
}
public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent p = new Parent();
		Child c = new Child();
		
		
	}

}
