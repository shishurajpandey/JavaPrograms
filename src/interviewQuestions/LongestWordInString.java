package interviewQuestions;

public class LongestWordInString {

	public static void main(String[] args) {
		String abc="Today I have learned nothing in my entire time";
		String x[]=abc.split(" ");
		int max=0;
		String LongWord="";
		
		//String rts="";
		
		for(String y :x)
			
		{
			if(y.length()>=max)
			{
				max=y.length();
				LongWord=y;
				
			}
		}
		System.out.println("Longest word has length "+max+ ". And word is "+ LongWord);

	}

}
