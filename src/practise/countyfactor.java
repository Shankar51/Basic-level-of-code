package practise;
import java.util.Scanner;
public class countyfactor {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	countFactor(n);
	}

	static void countFactor(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
