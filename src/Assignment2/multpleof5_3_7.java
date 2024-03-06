package Assignment2;

import java.util.Scanner;

public class multpleof5_3_7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n % 5 == 0 && n%3 == 0 && n%7 == 0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("NO");
		}


	}

}
