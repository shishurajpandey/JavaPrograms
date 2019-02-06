package interviewQuestions;

import java.util.Set;
import java.util.TreeSet;

public class PrintDistinctinIntegerArrayUsingSet {

	public static void main(String[] args) {
		int [] a= {1,2,3,4,3,4,5,6,7,4,35,6,7,7,5,43,2};
		
		Set<Integer> set=new TreeSet<Integer>();
		for(int x:a)
		{	
		set.add(x);
		}
		for(int y:set)
		{
		System.out.print(y+" ");
		}
	}

	
}
