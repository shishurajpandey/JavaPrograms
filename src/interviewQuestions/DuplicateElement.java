package interviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {
		
		//We have to find the duplicate element
	
		
       String a[]= {"Java", "Python", "Ruby","Go","Java","C","C++"};
       
       //Method-1 - Time complecity- 0(n^2)
       
       for(int i=0;i<a.length;i++)
       {
    	   for(int j=i+1;j<a.length;j++)
    	   {
    		   if(a[i].equals(a[j]))
    		   { 
    			   System.out.println("Duplicate element is : " + a[i]);  }
    	       }
       }
       
       //Method -2 Using Set
       
       Set<String> x=new HashSet<>();
       for(String z : a)
       {
    	   if(!x.add(z))
    	   {
    		   System.out.println("Duplicate element is :" +z);
    	   }
    		   
       }
       
       
       
       
       }
	}

