package Basic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Test {
	
	//Question to ask
	//toString, Returntype, Constructors, send data to methods and how to call them.
	
	public void m1(int i) {
		//void is used when we dont want to return anything from method.
	}
	
	public String m2() {
		//100 lines of code..
		return "abc";
	}
	
	public int m3() {
		int i = 10;
		//return i;
		return 20;
	}
	
	public Employee m4() {
		Employee e = new Employee();
		e.setId(101);
		e.setName("Sakshi");
		e.setAdd("Pune");
		
		return e;
	}
	
	public String m5() {
		return "sakshi";
	}
	
	public String m6() {
		//String s = m5();
		//return s;
		
		return m5();
	}
	
	public Employee m7() {
		Employee e = new Employee();
		e.setId(101);
		e.setName("abc");
		e.setAdd("Pune");
		
		return e;
	}
	
	public Employee m8() {
		Employee e = m7();
		return e;
	}
	
	public Employee m9() {
		Employee e = m8();
		return e;
	}
	
	List<Teacher> tlist = new ArrayList<Teacher>();
	Scanner sc = new Scanner(System.in);
	
	public void setData() {
		Address a1 = new Address();
		a1.setId(101);
		a1.setAreaName("karve nagar");
		a1.setCityName("Pune");
		
		Address a2 = new Address();
		a2.setId(102);
		a2.setAreaName("karve nagar");
		a2.setCityName("Pune");
		
		Student s1 = new Student();
		s1.setId(103);
		s1.setName("akash");
		s1.setAddress(a1);
		
		Student s2 = new Student();
		s2.setId(104);
		s2.setName("akash");
		s2.setAddress(a2);
		
		Teacher t1 = new Teacher();
		t1.setId(105);
		t1.setName("teacher1");
		t1.setStudent(s1);
		
		Teacher t2 = new Teacher();
		t2.setId(105);
		t2.setName("teacher2");
		t2.setStudent(s2);
		
		tlist.add(t1);
		tlist.add(t2);
	}
	
	public void setData1() {
		for (int i = 1; i <= 2; i++) {
            System.out.println("Enter data for Teacher " + i);

            Teacher teacher = new Teacher();
            Student student = new Student();
            Address address = new Address();

            // Teacher data
            System.out.print("Enter Teacher ID: ");
            teacher.setId(sc.nextInt());
            sc.nextLine(); 
            System.out.print("Enter Teacher Name: ");
            teacher.setName(sc.nextLine());

            // Student data
            System.out.print("Enter Student ID: ");
            student.setId(sc.nextInt());
            sc.nextLine();
            System.out.print("Enter Student Name: ");
            student.setName(sc.nextLine());

            // Address data
            System.out.print("Enter Area Name: ");
            address.setAreaName(sc.nextLine());
            System.out.print("Enter City Name: ");
            address.setCityName(sc.nextLine());

            student.setAddress(address);
            teacher.setStudent(student);

            tlist.add(teacher);

            System.out.println("Data added for Teacher " + i + "\n");
        }
	}
	
	public void getData() {
		
		System.out.println("get data..");
		
		 for (Teacher t : tlist) {
	            System.out.println("Teacher ID: " + t.getId());
	            System.out.println("Teacher Name: " + t.getName());
	            System.out.println("Student ID: " + t.getStudent().getId());
	            System.out.println("Student Name: " + t.getStudent().getName());
	            System.out.println("Area: " + t.getStudent().getAddress().getAreaName());
	            System.out.println("City: " + t.getStudent().getAddress().getCityName());
	            System.out.println("-----");
	        }
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t = new Test();
		t.setData1();
		t.getData();

	}

}
