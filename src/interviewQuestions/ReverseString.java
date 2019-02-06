package interviewQuestions;

public class ReverseString {

	public static void main(String[] args) {
		
		String x="Selenium";
		String rev = null;
		int StrLength = x.length(); 
		
		for(int i=x.length()-1;i>=0;i--)
		{
			rev=rev+x.charAt(i);
		}
		
		System.out.println(rev);
		
		StringBuffer bf=new StringBuffer("SeleniumHQ");
			bf.reverse();
			System.out.println(bf);

	}

}

