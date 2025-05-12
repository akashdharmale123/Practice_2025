package Basic;

import java.util.ArrayList;
import java.util.List;

public class CalculateCount {
	
	public void getListData(List<Object> k) {
		for(Object o : k) {
			if(o instanceof String) {
				String s1 = (String) o;
				System.out.println(s1);
			}
			else if(o instanceof Integer){
				int i = (int) o;
				System.out.println(i);
			}
			else if(o instanceof Double) {
				double d = (double) o;
				System.out.println(d);
			}
		}
	}

	public static void main(String[] args) {
		
		List<Object> l = new ArrayList<Object>();
		l.add("akash");
		l.add(10);
		l.add("sakshi");
		l.add(100.34);
		
		int i = 10;
		
		CalculateCount c = new CalculateCount();
		c.getListData(l);

	}

}
