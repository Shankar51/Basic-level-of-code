package Assignment2;
import java.util.Scanner;
public class threedigitornot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n>=100 && n<1000)
		{
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}

}
