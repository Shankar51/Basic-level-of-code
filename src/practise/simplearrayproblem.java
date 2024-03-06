package practise;
import java.util.Scanner;
public class simplearrayproblem {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int ar[] = new int[n];
	for(int i=0;i<ar.length;i++) 
	{
		ar[i]=scan.nextInt();
	}
	//int result = sum(ar);
	//int result = max(ar);
	int result = min(ar);
	System.out.println(result);
	}
	
	// sum of element present in array
	static int sum(int[]ar)
	{
		int sum = 0;
		for(int i =0 ; i<ar.length;i++)
		{
			sum = sum+ar[i];
		}
		return sum;
	}
	
	
	
	// maximum number present in array
	static int max(int []ar)
	{
		int max =Integer.MIN_VALUE;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>max)
			{
				max=ar[i];
			}
		}
		return max;
	}
	
	//minimum number present in array
	static int min(int []ar)
	{
		int min =Integer.MAX_VALUE;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<min)
			{
				min=ar[i];
			}
		}
		return min;
	}
	}
