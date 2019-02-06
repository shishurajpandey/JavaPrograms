package package1;

enum ShirtSize {Small,Medium,Large};

class Size{
	ShirtSize small;
}
public class TestEnum {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Size s = new Size();
		s.small = ShirtSize.Small;
		 // s.small = ShirtSize.Small         
	
		System.out.println(s.small);
	}

}
