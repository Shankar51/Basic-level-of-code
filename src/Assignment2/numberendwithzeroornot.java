package Assignment2;

import java.util.Scanner;

public class numberendwithzeroornot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n%10 == 0)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}

	}

}
