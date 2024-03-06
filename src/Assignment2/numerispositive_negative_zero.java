package Assignment2;
import java.util.Scanner;
public class numerispositive_negative_zero {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n>0)
		{
			System.out.println("positive");
		}
		else if(n<0)
		{
			System.out.println("negative");
		}
		else if(n==0)
		{
			System.out.println("zero");
		}
	}

}
