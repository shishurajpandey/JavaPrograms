package telusko_mar_2018;

class g{
	
}

interface Mp{
	public void sum();
}


public class LambdaExpression {

	public static void main(String[] args) {

		
		//Example of Anyonoums Class
		g G=new g(){
		
			private void sum() {
				System.out.println("Doing Sum");

			}

	};
	
	//Lambda Expression-Converting below method to lambda expression.
	/*Mp mp=new Mp() {
		public void Sub() {
			System.out.println("Doing Sub");
		}
	};*/
	
	//Lambda expression
	Mp mp=()-> System.out.println("Doing Sum in Lambda");
	
	
	
	}
	}
