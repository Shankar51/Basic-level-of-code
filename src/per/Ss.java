package per;
import java.util.Scanner;

public class Ss {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		//1. factor(n);
		//2. System.out.println(cntFactor(n));
		//3. countFactor(n);
		//4. prime(n);
		//5. System.out.println(isPrime(n));
		//6. isPrime2(n);
		//7. printPrime(n);
	}
		
		
		
	//1. find the factors of given number	
	static void factor(int n){
	for(int i=1;i<=n;i++)
	{
		if(n%i==0)
		{
			System.out.println(i+" ");
		}
	}

  }
	
	
	//2.find and count the factor of given number
	static int cntFactor(int n){
	int count = 0;
	for(int i=1;i<=n;i++)
	{
		if(n%i==0)
		{
		count++;
		}
	}
     return count;
 }
	
	
	
	//3. find and count the factor of given number
	static void countFactor(int n)
	{
		int count = 0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i+" ");
			count++;
			}
		}
		System.out.println("number of count is:"+count);

	}
	
	
	// find prime number
	static void prime(int n)
	{
		int count = 0;
		for(int i=1;i<=n;i++)
		{
		if(n%i==0)
		{
			count++;
		}
	   }
		if(count==2)
		{
		System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
	}
	
	
	//5. finding prime number in efficient way
	static boolean isPrime(int n)
	{
	for(int i=2; i<=n/2 ;i++)
	{
		if(n%i==0)
		{
			return false;
		}
	}
	return true;
  }
	
	
	
	
	//6. OR
	
	static void isPrime2(int n)
	{
		int count =0;
		for(int i =2; i<=n/2;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
	}
	
	
	//7. find the prime number till given number
	static void printPrime(int n)
	{
		for(int i=2;i<=n;i++)
		{
			if(isPrime(i))
			{
				System.out.println(i);
			}
		}
	}
}
