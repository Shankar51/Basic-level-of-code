package Assignment2;
import java.util.Scanner;
public class twodigitornot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n>9 && n<100)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}

}
