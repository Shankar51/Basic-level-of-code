package Assignment2;
import java.util.Scanner;
public class multipleof5_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n % 15 == 0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("NO");
		}

	}

}
