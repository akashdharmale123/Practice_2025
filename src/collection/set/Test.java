package collection.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test {
	
	
	
	public void setStudentByConstructor() {
		Set<Student> set = new HashSet<Student>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=1; i<3; i++) {
			System.out.println("Enter Student Details: ");
			System.out.println("Enter Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Name: ");
			String name = sc.nextLine();
			
			System.out.println("Enter Address: ");
			String addr = sc.nextLine();
			
			Student st = new Student(id, name, addr);
			
			set.add(st);
		}
		
		for(Student s : set) {
			System.out.println(s);
		}
		
	}
	
	public void setStudentBySetter() {	
		Set<Student> set = new HashSet<Student>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=1; i<3; i++) {
			
			Student st = new Student();
			
			System.out.println("Enter Student Details: ");
			System.out.println("Enter Id: ");
			int id = sc.nextInt();
			st.setId(id);
			sc.nextLine();
			
			System.out.println("Enter Name: ");
			String name = sc.nextLine();
			st.setName(name);
			
			System.out.println("Enter Address: ");
			String addr = sc.nextLine();
			st.setAddress(addr);
			
			set.add(st);
		}
		
		for(Student s : set) {
			System.out.println(s);
		}
		
	}
	
	
	public void setStudentByObjects() {	
		Set<Student> set = new HashSet<Student>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=1; i<3; i++) {
			
			Student st = new Student();
			
			System.out.println("Enter Student Details: ");
			System.out.println("Enter Id: ");
			st.id = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("Enter Name: ");
			st.name = sc.nextLine();
			
			
			System.out.println("Enter Address: ");
			st.address = sc.nextLine();
			
			set.add(st);
		}
		
		for(Student s : set) {
			System.out.println(s);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Test t = new Test();
		//t.setStudentByConstructor();
		//t.setStudentBySetter();
		t.setStudentByObjects();
	}

}
