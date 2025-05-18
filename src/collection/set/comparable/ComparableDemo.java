package collection.set.comparable;

import java.util.TreeSet;

public class ComparableDemo {
	
	public static void main(String[] args) {
		
		// Comparable is an Interface.
		// it conatain Only 1 abstract method -> public int compareTo(T o);
		//
		// obj1.compareTo(obj2);
		// returns -ve if obj1 < obj2 = -1
		// returns +ve if obj1 > obj2 = +1 = 
		// returns 0 if obj1 == obj2 = 0
		
		TreeSet<String> t = new TreeSet();
		t.add("K"); // its a 1st object
		t.add("Z");
		t.add("A");
		t.add("A");
		t.add("K");
		
		
		// K is our 1st obj
		// Z.CompareTo(K)
		// A.compareTo(K)
		// A.compareTo(K)
		
		
		for(String s : t) {
			System.out.println(s);
		}
		
	}

}
