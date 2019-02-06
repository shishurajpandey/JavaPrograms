package telusko_mar_2018;

public class InheritenceConstructor {

	public static void main(String[] args) {
	
             //X x=new X();
		//Y y=new Y();
		Y y=new Y(5);
	}
		
}

class X {
	
	public X(){	
		System.out.println("In Const X");
	}
	
	public X(int z) {
		System.out.println("In param const X");
	}
}

class Y extends X{
	
	public Y() {
		System.out.println("In const Y");
	}
	
	public Y(int z) {
		System.out.println("In param const Y");
	}
}