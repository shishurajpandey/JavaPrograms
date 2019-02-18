package interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,9};
		
		List list=new ArrayList(Arrays.asList(a));
		list.addAll(Arrays.asList(b));
		
		Object[] c=list.toArray();
		for(Object x:c)
		System.out.println(x);
		
		
		int [] z=new int[a.length+b.length];
		
	
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
			count++;
		}
		for(int j=0;j<b.length;j++)
		{
			c[count]=b[j];
			count++;
		}
	}
	
}
