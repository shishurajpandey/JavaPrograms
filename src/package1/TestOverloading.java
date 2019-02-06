package package1;

class Overloading{
	
	public void method1(){
		System.out.println("Method1");
	}

   public int method1(int i){
	   System.out.println("Method1 with Int " + i);
	   return 2;
   }
   
   public void method1(String s){
	   System.out.println("Method1 with String : " + s);
   }
}
public class TestOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overloading o1 = new Overloading();
		o1.method1(5);
		o1.method1("Java");

	}

}
