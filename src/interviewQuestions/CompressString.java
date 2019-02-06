package interviewQuestions;

public class CompressString {

	public static void main(String[] args) {
		
		String str="aaaccceeeeeeffggrd";
	
		
		int count=1;
		char temp=str.charAt(0);
		
		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(i)==temp)
			{
				count++;
			}else {
				System.out.print(temp+""+count);
				count=1;
				temp=str.charAt(i);
			}
			
			
		}
		System.out.print(temp+""+count);

	}

}
