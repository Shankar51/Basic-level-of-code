package Assignment2;

import java.util.Scanner;

public class threedigitnumandmul2_5_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n>99 && n<1000 && n %10 ==0)
		{
			System.out.println("yes");
		}
		else
		{
          System.out.println("no");
		}

	}

}
