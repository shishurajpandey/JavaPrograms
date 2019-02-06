package package1;

public class TestStringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Pune";
		String s2 = s1;
		
//		System.out.println("s1 " + s1);
//		System.out.println("s2 " + s2);
//		
	  //   s1.concat(" Mumbai");
	//	s1.concat("Nagpur");
		
	    System.out.println(s1.concat(" Mumbai"));
		System.out.println("s1 " + s1);
		System.out.println("s2 " + s2);
		
		
		// String Methods
		
		String s = "Java is Object Oriented Programming Language";
		s1 = "Pune";
		System.out.println("Char at " + s.charAt(2));
		System.out.println(s.concat(" New String"));
		System.out.println(s1.equalsIgnoreCase("Pune") + "    " + s.equalsIgnoreCase("abc"));
		System.out.println("Leanght " + s1.length());
		System.out.println("Sub String " + s.substring(5, 15) + "  " + s.substring(9));
		System.out.println("Index " + s.indexOf("is"));
		System.out.println("Replace " + s.replace("is", "was"));
	
	}

}
