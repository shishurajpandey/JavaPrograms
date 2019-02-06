package telusko_java;


interface A{
	
	void show();
	
}

/*class myImp implements A{
//Purpose of this class is implement interface
	@Override
	public void show() {
		System.out.println("Hello");	
	}	
}*/

public class SAMInterface {

	public static void main(String[] args) {

		A a=() -> System.out.println("Hello-1"); //Functional Interface
		a.show();		
			/*A a1=new A() {
				@Override
				public void show() {
					System.out.println("Hello-2");	
				}
				
			
			};*/
		A a1=() ->System.out.println("hello-2");
		a1.show();

	}

}
