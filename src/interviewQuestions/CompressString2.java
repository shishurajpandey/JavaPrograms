package interviewQuestions;

public class CompressString2 {

	public static void main(String[] args) {
		String str="aaaccceeeeeeffggrd";

		
		int count=1;
		
		char temp=str.charAt(0);
		
		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(i)==temp)
			{
			count++;
			}
			else {
				System.out.print(count+""+temp);
				temp=str.charAt(i);
				count=1;
			}
		}
		System.out.println(count+""+temp);
		
	}

}
