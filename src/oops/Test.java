package oops;

public class Test implements First {
	
	//ABstraction means - hiding implementation logic showing only functionlity.
	
	public void m1() {
		System.out.println("m1..");
	}
	

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First f = new Test();
		f.m1();
	}

}
