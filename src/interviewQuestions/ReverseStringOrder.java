package interviewQuestions;

public class ReverseStringOrder {

	public static void main(String[] args) {
		String s="This is hello world Program";
		char [] a=s.toCharArray();
		char [] b=new char[a.length];
		for(int i=0;i<b.length;i++)
		{
			b[i]=a[b.length-i-1];
		}
		for(char p:b)
		{
			System.out.print(p);
		}

	}

}
