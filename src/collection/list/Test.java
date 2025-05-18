package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Test {
	
	public void List() {
		//What is List..??
		//List is a child interface of Collection Interfcae
		//List inteface introduces in 1.2 version
		
		List<Integer> list = new ArrayList(); //List is an interface so directly we cant create object of interface
									// so here we are using List's one of implemented class = ArrayList.
		list.add(101);
		list.add(102);		
		
		for(int i : list) {
			System.out.println(i);
		}
		
		System.out.println("---------------------------");
		
		
		// ArrayList.....??
		// ArrayList is a Implemented class of List Interface.
		// underlying DS is = Resizable Array 0r Growable array.
		// Duplicates are allowed.
		// Insertion Order is followed.
		// Hetreogenious Objects are allowed.
		// Null insertion is possible.
		
		// ArrayList implemented RandomAccess iterface.
			// RandomAccess interface:- can fetch the random element from list at the same speed.
			// its an Marker Interface
				//Marker Interface:- its means that interfcae dont have any methods, (blank interface)
			
		// ArrayList is Best choise if we want Retriver/Get/Fetch operation,
			//because it has implemented RandomAccess interface.
		
	}
	
	public void LinkedListDemo() {
		// LinkedList is also Child or Implemented class of List interface.
		// underlying DS is = Doubly LinkedList.
		// Duplicates are allowed.
		// Insertion Order is followed.
		// Hetreogenious Objects are allowed.
		// Null insertion is possible.
		
		// LinkedList implemented Serelizable & clonable iterface.
		// does not implemented RandomAccess interface
		// so thus LinkedList is best choise when our operation is Insert or Delete operation in middle.
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(100);
		ll.add(200);
		ll.add(300);
		
		for(int l : ll) {
			System.out.println(l);
		}
	}
	
	
	public void VectorDemo() {
		// Vector.....??
		// Vector is a Implemented class of List Interface.
		// underlying DS is = Resizable Array 0r Growable array.
		// Duplicates are allowed.
		// Insertion Order is followed.
		// Hetreogenious Objects are allowed.
		// Null insertion is possible.
		
		// Vector is exactly same as ArrayList
		// but the difference is 
		
		// write this in diff page or in question like
			//diff betn ArrayList & Vector (make partition in page)
		
		// ArrayList
		// 1.Every method present in ArrayList is Non-Synchronize
		// 2.Non-Synchronized means -  at a time Multiple thread are allowed to operate on Arralist Object.
			//hence its not thread safe.
		// 3.Relatively performance is high, coz Multiple thread are allowed to operat at a time.
		// 4.Introduced in 1.2v
		
		
		// Vector
		// 1.Every method present in ArrayList is Synchronize
		// 2.Synchronized means -  at a time Multiple thread are NOT-allowed to operate on Vector Object.
			//hence its not thread safe.
		// 3.Relatively performance is low, coz Multiple thread are NOT-allowed to operate at a time.
		// 4.Introduced in 1.0v (thus its a legacy class..)
		
		Vector<Integer> v = new Vector();
		v.add(101);
		v.add(102);
		
		for(int i : v) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Test t = new Test();
	}

}
