package Assignment2;

import java.util.Scanner;

public class numberASCIIvalueornot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n>=65&&n<=90 || n>=97&& n<=122 || n>=48&&n<=57)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}

	}

}
