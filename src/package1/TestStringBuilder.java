package package1;

public class TestStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder br = new StringBuilder("String Builder");
		br.append(" Append");
		System.out.println(br);
		
		
		StringBuffer bf = new StringBuffer("String Buffer");
		bf.append(" Append");
		System.out.println(bf);
		
		
		StringBuilder s = new StringBuilder("Java is Object Oriented Programming Language");
		
		s.delete(3, 6);
		System.out.println("After delete " + s);
		System.out.println("Reverse " + s.reverse());
	}

}
