package interviewQuestions;

public class ReverseStringWithIntactWords {

	public static void main(String[] args) {
		/*	String s="This is hello world Program";
		System.out.println(reverse(s));

	}

	public static String reverse(String s) {
		String reverse="";
		String actual=s;
		
		String [] splitarray=actual.split("\\s");
		
		for(String a:splitarray)
		{
			reverse=" "+a+reverse;
		}
		
		return reverse;*/
		
	String actual="This is hello World Program";	

		
		System.out.println(reverse(actual));
	
	}
	
	public static String reverse(String actual) {
		String Actual=actual;
		String reverse="";
		String [] revs=Actual.split("\\s");
        for(String rev:revs)		
        {
        	reverse=" "+rev+reverse;
        }
		
		return reverse;
	}

}
