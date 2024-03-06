package Assignment2;
import java.util.Scanner;
public class oddoreven {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n%2 == 0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	}

}
