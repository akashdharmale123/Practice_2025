package collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {
	
	public void HashMapDemp() {
		
		//Map ==> Map is NOT child interface of collection interface.
		
		// If we want to represent group of Objects as in key-value pair then use Map.
		// Both key and values are Object only
		// Duplicate Keys are NOT allowed.
		// BUT
		// Duplicate Values are allowed
		
		// How to write a Map
		
		Map<Integer, String> m = new HashMap<Integer, String>();
		// here we are giving key = Integer type
		//					value = String type.
		// we can give any type in key & value (means key can be String, Integer.. etc. also Value can be anything)
		// before MAP we used .add() method to add objects in LIST & SET.
		// BUT 
		// In MAP we use .put() method.
		// .add() -> can add only one value,
		// .put() -> must add 2 values 1 for KEY, and 2nd for Value as below.
		// Key & Value pair called as ENTRY.
		
			m.put(101, "akash"); 
			m.put(102, "sakshi");
			m.put(103, "arjun");
			
		// How to itterate MAP :-
			for(Map.Entry<Integer, String> e : m.entrySet()) {
				System.out.println("key : " + e.getKey() + "    Value : " + e.getValue() );
			}
			
			
		// Hashmap :-
			// underlying DS = HASHTABLE. (underlying -> means hasmap used Hashtable as a DS)
			// insertion order is not follwed - but its based on Hashcode of keys.
			// Duplicate Keys are not allowed BUT values can be duplicate.
			// Hetrogenious Objects are allowed  for both KEY & Value.
			// Null is allowed for KEY (only ONCE)
			// Null is allowed for values (any number of times)
			// Hashmap implements Serializable & clonable interface but NOT RandomAccess interface.
			// Hashmap is best choise if our frequent operation is SEARCH operation.
			
	}
	
	
	public void LinkedHashMapDemo() {
		// LinkedHashMap is exact same as HashMap
		// diff is
		// Hashmap :- underlying DS is - HASHTABLE
				 // insertion order is not follwed - but its based on Hashcode of keys. 
				// 1.2v
		
		// LinkedHashMap :- underlying DS is combination of - HASHTABLE + LinkedList
				// insertion order is follwed.
				// 1.4v
		
		LinkedHashMap<Integer, String> m = new LinkedHashMap<Integer, String>();
		m.put(101, "akash");
		m.put(102, "sakshi");
		m.put(103, "arjun");
		
		for(Map.Entry<Integer, String> e : m.entrySet()) {
			System.out.println("key : " + e.getKey() + "    Value : " + e.getValue() );
		}
				
	}
	
	
	public void TreeMap() {
		
		// Sortedmap (i)
		//	  |
		// NavigableMap (i)
		//    |
		// TreeMap (class) :-
			// Underlying DS = RED-BLACK tree.
			// Insertion order is NOT followed - but its based on some sorting order of KEY.
			// Duplicate Keys are NOT allowed but Values can be duplicated.
			// If we are depending on Natural sorting Order then KEY need to be Homogenious & Comparable. 
			// after 1.7 vesion null is not allow for both KEY.

	}
	
	
	
	public static void main(String[] args) {
		MapDemo m = new MapDemo();
		m.HashMapDemp();
	}

}
