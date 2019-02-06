package interviewQuestions;

public class ReverseStringMaintinRightWords {

	public static void main(String[] args) {
		String x="My name is Shishu Raj Pandey";
		//We need to revers it in this format
		//Pandey Raj Shishu is name My

		String y[]=x.split(" ");
		String rev="";
		
		for(String z:y)
		{
			
			rev=z+" "+rev;
			System.out.println(rev);
		}
		
		System.out.println(rev.trim());
	}

}
