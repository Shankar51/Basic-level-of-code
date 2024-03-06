package Assignment2;

import java.util.Scanner;

//		write a program to find the sum of even number between 1 to 100

public class Doubt {

	public static void main(String[] args) {		
		
	Scanner scan = new Scanner(System.in);
	int n  = scan.nextInt();

	
	System.out.println(isPrime(n));
		
		
	}
	static String isPrime(int n) {
		if(n<=1) {
			return "not prime";
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return "not prime";
			}
		}
		return "prime";
	} 
	

}
