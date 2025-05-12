package CollectionProject.client;

import java.util.Scanner;

import CollectionProject.serviceImpl.karvenagar;

public class Test {
	
	public void switchCaseUsingIfElseIF() {
		karvenagar k = new karvenagar();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----- Welcome bro -----");
		System.out.println(" 1.Add Course\n "
				+ "2.View Course\n "
				+ "3.Add Faculty\n "
				+ "4.View Faculty\n "
				+ "5.Add Batch\n "
				+ "6.View Batch\n "
				+ "7.Add Student\n "
				+ "8.View Student\n "
				+ "9.Exit");
		while(true) {	
			int choice = sc.nextInt();
			if (choice == 1) {
			    k.addCourse();
			}
			else if (choice == 2) {
			    k.viewCourse();
			}
			else if (choice == 3) {
			    k.addFaculty();
			}
			else if (choice == 4) {
			    k.viewFaculty();
			}
			else if (choice == 5) {
			    k.addBatch();
			}
			else if (choice == 6) {
			    k.viewBatch();
			}
			else if (choice == 7) {
			    k.addStudent();
			}
			else if (choice == 8) {
			    k.viewStudent();
			}
			else if (choice == 9) {
			    System.exit(0);
			}
			else {
			    System.out.println("Invalid Choice!");
			}
		}
	}
	
	public static void main(String[] args) {
		
		karvenagar k = new karvenagar();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----- Welcome bro -----");
		System.out.println(" 1.Add Course\n "
				+ "2.View Course\n "
				+ "3.Add Faculty\n "
				+ "4.View Faculty\n "
				+ "5.Add Batch\n "
				+ "6.View Batch\n "
				+ "7.Add Student\n "
				+ "8.View Student\n "
				+ "9.Exit");
		
		while(true) {	
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1: {
				k.addCourse();
				System.out.println("-----------------------------------");
				System.out.println("     ----- Add Choice ------");
				break;
			}
			case 2:{
				k.viewCourse();
				System.out.println("-----------------------------------");
				System.out.println("     ----- Add Choice ------");
				break;
			}
			case 3:{
				k.addFaculty();
				System.out.println("-----------------------------------");
				System.out.println("     ----- Add Choice ------");
				break;
			}
			case 4:{
				k.viewFaculty();
				System.out.println("-----------------------------------");
				System.out.println("     ----- Add Choice ------");
				break;
			}
			case 5:{
				k.addBatch();
				System.out.println("-----------------------------------");
				System.out.println("     ----- Add Choice ------");
				break;
			}
			case 6:{
				k.viewBatch();
				System.out.println("-----------------------------------");
				System.out.println("     ----- Add Choice ------");
				break;
			}
			case 7:{
				k.addStudent();
				System.out.println("-----------------------------------");
				System.out.println("     ----- Add Choice ------");
				break;
			}
			case 8:{
				k.viewStudent();
				System.out.println("-----------------------------------");
				System.out.println("     ----- Add Choice ------");
				break;
			}
			case 9:{
				System.exit(0);
			}
			default:
				System.out.println("you Entered invalid choice bro..");
			}
			
		}
	}
}
