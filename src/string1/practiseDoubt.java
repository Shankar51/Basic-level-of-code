package string1;

import java.util.Scanner;

public class practiseDoubt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("size of array");
		int n = scan.nextInt();
		int ar[] = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}



	}

	static void sumEqualsPrime(int[] ar) {
		boolean found=false;
		for (int i = 0; i < ar.length - 1; i++) {
			for (int j = i + 1; j < ar.length; j++) {
			int	sum=ar[i]+ar[j];
				if(isPrime(sum)) {
					System.out.println(ar[i]+" "+ar[j]);
					found=true;
				}
			}
		}
		if(found==false) {
			System.out.println(-1);
		}
		
	}
		
	
	
	static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
