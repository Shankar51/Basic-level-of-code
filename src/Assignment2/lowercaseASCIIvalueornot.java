package Assignment2;
import java.util.Scanner;
public class lowercaseASCIIvalueornot {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	if(n>=97 && n <= 122)
	{
		System.out.println("YES");
	}
	else
	{
		System.out.println("NO");
	}
	}

}
