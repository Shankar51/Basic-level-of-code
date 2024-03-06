package Assignment2;
import java.util.Scanner;
public class gameiftwointgeriseventhanproductelseadd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		if(m%2==0 && n%2 == 0)
		{
			System.out.println(m*n);
		}
		else
		{
			System.out.println(n+m);
		}
	}

}
