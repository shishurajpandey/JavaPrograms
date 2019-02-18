package interviewQuestions;


interface Drawable{
	
	public void draw();
}

//Without lambda, With Anoyonomus class
public class LambdaExpressionsEg {

	public static void main(String[] args) {
		
		Drawable d = new Drawable() {
			public void draw(){
			System.out.println("I can draw");
			}
		};
	}
}


class LambdaExpressionsEg1 {

	public static void main(String[] args) {

//Without lambda Expression, With curly braces
		Drawable d1 = () -> {
			System.out.println("I can draw");
		};
		
		d1.draw();
	
//With lambda Expression, Without curly braces
		Drawable d2 = () -> System.out.println("I can draw");	
		d2.draw();

//With lambda Expression, With parameters
//		Drawable d2 = (a,b) -> System.out.println("I can draw");	
//		d2.draw();
		
	}
}

