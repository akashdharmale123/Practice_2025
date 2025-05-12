package Basic;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number of array input ");
		int n = sc.nextInt();	
		
		int[] num = new int[n];
		System.out.println("Enter " + n + " Numbers ");		
		for(int i=0; i<n; i++) {
			num[i]= sc.nextInt();
		}
		
		//int[] num = {2,4,5,6,7,12}
		
		for(int i=0; i<n; i++) {
			int x = num[i];
			if(x <=1) {
				continue;
			}
			
			boolean isPrime = true;
			
			for(int j=2; j<= x/2; j++) {
				if(x % j == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) {
				System.out.print(x + ", ");
			}
		}

	}

}
