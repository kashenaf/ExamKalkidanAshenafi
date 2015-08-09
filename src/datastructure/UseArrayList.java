package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		
		//declare
		ArrayList<String> names = new ArrayList<String>();
		//add
		names.add("kalkidan Asheanfi");
		names.add("John Smith");
		names.add("Emnet Asheanfi");
		names.add("alexander Smith");
		
		//Iterator
		Iterator items = names.iterator();
		while(items.hasNext())
			System.out.println(items.next());
		
		for(String i: names)
			System.out.println(i);
		//retrieve		
		for(int i=0;i<names.size();i++)
			System.out.println(names.get(i));
		

		names.set(0, "Will Smith");
		//removes name
		names.remove(1);
		
		
		
	
		
		
		
	}

}
