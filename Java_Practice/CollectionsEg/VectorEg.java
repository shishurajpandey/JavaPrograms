package CollectionsEg;

import java.util.Vector;

public class VectorEg {

	public static void main(String[] args) {
		//Vector is also a dynamic arraay which can store collection of Objects.
		//Difference bw vector and array list is 
		/**
		 * 
		 * Vector is thread safe, Vector is slow, Vector will increase the capacity by 100%
		 * Array list is not thread safe, ArrayList is fase, ArrayList will increase the capcity by 50% only
		 */
		
		Vector<String>v=new Vector<>();
		v.add("Shishu");
		v.add("Raj");
		v.add("Pandey");
		System.out.println(v.get(1));

	}

}
