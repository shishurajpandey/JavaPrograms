package CollectionsEg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListEg {

	public static void main(String[] args) {
		
		
		//Collection is an interface which contain various method to store and manipulate group of objects.
		//If we are not using generics that means we can store any type of objects in that collection
		//Generics is used to specify the type of object we are going to store on our collection.
		Collection c=new ArrayList<>();
		
	c.add(1);
	c.add("Hello");
	c.add(4.50f);
	
for(Object x:c)
	System.out.println(x);
	

	List<Integer> x=new ArrayList<>();
	x.add(1);
	x.add(2);
	x.add(3);
	for(int y:x)
	{
		System.out.println(y);
	}
	 x.add(3, 4);
    System.out.println( x.get(3));
	}
	

}
