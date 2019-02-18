package package1;
interface Interface1{
	int k = 5;
	void method1();
	int method2();
	
}

interface Interface2{
	void method3();
	
}

class Class1 implements Interface1{
	
	@Override
	public void method1(){
		
	}
	
	@Override
	public int method2(){
		return 5;
			
	}
	
}
public class TestInterface implements Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
@Override
public void method1(){
		
	}
	
	@Override
	public int method2(){
		return 5;
			
	}

}
