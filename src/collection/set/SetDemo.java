package collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	
	
	public void setExample() {
		//Set is an interface, it is a child interface of collection inteface.
		// if we want to represet group of entities (objects) into single unit
		//   where dublicates are not allowed and insertion order is not-followed.
		
		
		//Hashset :- 
		// Hashset is child class od Set Interface.
		// duplicates are not allowed
		// insertion order is not allowed.
		// we can add hetrogenious objects
		// null insertion is possible.
		// underlying DS of Hashset is HASHMAP.
		
		Set s = new HashSet();
		s.add(null);
		s.add(null);
		
		
		// LinkedHashSet :- 
		// LinkedHashSet is child class of Set Interface.
		// duplicates are not allowed
		// insertion order is allowed.
		// null insertion is possible
		// underlyig DS =  Doubly_linkedList + Hashmap 
		
		LinkedHashSet l = new LinkedHashSet();
		l.add("akash");
		l.add(123);
		l.add(null);
		l.add(null);
		
		
		
		//TreeSet :- 
		// TreeSet is child class of Sorted-Set Interface.
		// duplicates are not allowed
		// insertion order is not allowed & its based on some sorting order
			// ither it can be natural sorting order or user defined order
				// by using Comparable & Comparator
		// underlying DS = Red-Black tree.
		
		TreeSet<Integer> t = new TreeSet();
		t.add(10);
		t.add(1);
		t.add(5);
		t.add(3);
		
		for(int i : t) {
			System.out.println(i);
		}
		
	}
	
	public static void main(String[] args) {
		SetDemo sd = new SetDemo();
		sd.setExample();
	}

}
