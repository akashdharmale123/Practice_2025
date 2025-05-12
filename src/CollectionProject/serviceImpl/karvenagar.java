package CollectionProject.serviceImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import CollectionProject.model.Batch;
import CollectionProject.model.Course;
import CollectionProject.model.Faculty;
import CollectionProject.model.Student;
import CollectionProject.service.CJC;

public class karvenagar implements CJC {
	
	List<Course> clist = new ArrayList<Course>();
	List<Faculty> flist = new ArrayList<Faculty>();
	List<Batch> blist = new ArrayList<Batch>();
	List<Student> slist = new ArrayList<Student>();
	Scanner sc = new Scanner(System.in);
	
	
	@Override
	public void addCourse() {
		Course c = new Course();
		
		System.out.println("Enter Course Data: ");
		System.out.println("Course Id: ");
		c.setCid(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Course Name: ");
		c.setCname(sc.next());
		
		clist.add(c);
	}
	
	@Override
	public void viewCourse() {
		
		// what are the cursers in java..
		// 3 cursor
		// Iterator (universal cursor)
		// ListIterator
		// Enumeration
		
		
		Iterator<Course> itr = clist.iterator();
		while(itr.hasNext()) {
			Course c = itr.next();
			System.out.println("Course ID: " + c.getCid());
			System.out.println("Course Name: " + c.getCname());
		}
	}
	
	@Override
	public void addFaculty() {
		Faculty f = new Faculty();
		System.out.println("Enter Faculty Data: ");
		System.out.println("Faculty Id: ");
		f.setFid(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Faculty Name: ");
		f.setFname(sc.next());
		
		System.out.println("Add Course into Faculty (give Course ID here..) ");
		int cid = sc.nextInt();
		for(Course c : clist) {
			if(cid == c.getCid()) {
				f.setCourse(c);
				break;
			}
		}
		
		flist.add(f);
	}
	
	@Override
	public void viewFaculty() {
		Iterator<Faculty> itr = flist.iterator();
		while(itr.hasNext()) {
			Faculty f = itr.next();
			System.out.println("Faculty Id: " + f.getFid());
			System.out.println("Faculty Name: " + f.getFname());
			if(f.getCourse() != null) {
				System.out.println("Course: ");
				System.out.println("      Course Id: " + f.getCourse().getCid());
				System.out.println("      Course Name: " + f.getCourse().getCname());
			}
		}
	}
	
	@Override
	public void addBatch() {
		Batch b = new Batch();
		System.out.println("Enter Batch Data: ");
		System.out.println("Batch Id: ");
		b.setBid(sc.nextInt());
		
		System.out.println("Batch Name: ");
		b.setBname(sc.next());
		
		System.out.println("Add Faculty into Batch (give Batch ID here..) ");
		int fid = sc.nextInt();
		
		for(Faculty f : flist) {
			if(fid == f.getFid()) {
				b.setFaculty(f);
				break;
			}
		}
		
		blist.add(b);
	}
	
	@Override
	public void viewBatch() {
		Iterator<Batch> itr = blist.iterator();
	    while (itr.hasNext()) {
	        Batch b = itr.next();
	        System.out.println("Batch Id: " + b.getBid());
	        System.out.println("Batch Name: " + b.getBname());
	        if (b.getFaculty() != null) {
	            Faculty f = b.getFaculty();
	            System.out.println("Faculty: ");
	            System.out.println("      Faculty Id: " + f.getFid());
	            System.out.println("      Faculty Name: " + f.getFname());
	            if (f.getCourse() != null) {
	                Course c = f.getCourse();
	                System.out.println("      Course: ");
	                System.out.println("            Course Id: " + c.getCid());
	                System.out.println("            Course Name: " + c.getCname());
	            }
	        }
	    }
	}
	
	
	@Override
	public void addStudent() {
		Student s = new Student();
		System.out.println("Enter Student Data: ");
		System.out.print("Student ID: ");
        s.setSid(sc.nextInt());
        
        System.out.print("Student Name: ");
        s.setSname(sc.next());

        System.out.println("Add Batch into student (enter batch Id here..) ");
        int bid = sc.nextInt();
        for (Batch b : blist) {
            if (b.getBid() == bid) {
                s.setBatch(b);
                break;
            }
        }
        slist.add(s);
	}
	
	
	@Override
	public void viewStudent() {
		Iterator<Student> itr = slist.iterator();
	    while (itr.hasNext()) {
	        Student s = itr.next();
	        System.out.println("Student Id: " + s.getSid());
	        System.out.println("Student Name: " + s.getSname());
	        
	        if (s.getBatch() != null) {
	            Batch b = s.getBatch();
	            System.out.println("Batch: ");
	            System.out.println("      Batch Id: " + b.getBid());
	            System.out.println("      Batch Name: " + b.getBname());

	            if (b.getFaculty() != null) {
	                Faculty f = b.getFaculty();
	                System.out.println("      Faculty: ");
	                System.out.println("            Faculty Id: " + f.getFid());
	                System.out.println("            Faculty Name: " + f.getFname());

	                if (f.getCourse() != null) {
	                    Course c = f.getCourse();
	                    System.out.println("            Course: ");
	                    System.out.println("                  Course Id: " + c.getCid());
	                    System.out.println("                  Course Name: " + c.getCname());
	                }
	            }
	        }
	    }
	}
	
	

}
