package Assignment2;

import java.util.Scanner;

public class uppercaseASCIIvalueornot {
	public static void main(String [] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	if(n>=65 && n <= 90)
	{
		System.out.println("YES");
	}
	else
	{
		System.out.println("NO");
	}
  }
}
