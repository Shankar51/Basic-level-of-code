package practise;
import java.util.Scanner;
public class primenumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); 
		System.out.println(isprimenumber(n));
		}
	static boolean isprimenumber(int n)
	{
		for(int i = 2; i<=n/2;i++)
		{
			if(n%i==0)
			{
			return false;
			}
		}
		return true;
	}
}
