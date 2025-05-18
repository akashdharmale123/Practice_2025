package collection.set.comparator;

import java.util.TreeSet;

public class ComparatorDemo {
	
	public static void main(String[] args) {
		
		MyComparator m = new MyComparator();
		
		TreeSet<Integer> t = new TreeSet<Integer>(m);
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		
		
		for(int i : t) {
			System.out.println(i);
		}
	}

}
