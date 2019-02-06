package telusko_mar_2018;

public class SplitProgram {

	public static void main(String[] args) {
		String str=" Ram, Shyam, Naveen, Shishu, Raj";
		
		String a[]=str.split(",");
		for(String x:a)
		{
			System.out.println(x);
		}

		
		String y="My name is Ram";
		System.out.println(y);
		reverseString(y);
		
	}

	private static void reverseString(String m) {
	
	String z=null;
		
		String rev[]=m.split(",");
		
		for (String w:rev) {
			System.out.println(w);
			System.out.println("l");
			z=" "+rev+z;
		}
		System.out.println(rev);
		System.out.println(z);
		
	}

	
	
}
