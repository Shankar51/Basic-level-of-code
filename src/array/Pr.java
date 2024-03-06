package array;
import java.util.Scanner;

public class Pr {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of array");

		int n = scan.nextInt();
	   int[]a = new int[n]; 
	   for (int i = 0;i<a.length;i++)
	   {
		   a[i] = scan.nextInt(); 
	   }
	     //1  evenIndex(a);
	     //2  evenEle(a);
	     //3   maxEle(a);
	     //4    minEle(a);
	     //5  maxMinSum(a);
	     //6 countR(a);
	     //7 product(a);
	     //8 minOccurance(a);
	     //9 secondLargest(a);
	     //10 missingNumber(a);
	     //11 printNumberCount(a);
	     // 12 maxOccur(a);
	      
	      minMax(a);
	   
	    

	   
		
		
	}
	
	//1 element present in even index
	
	public static void evenIndex(int a[]){
		for(int i= 0;i<a.length;i++)
		{
			if(i%2==0)
			System.out.println(a[i]);
			
		}
		
	}
	
	
	
	//2 even element from array
	public static void evenEle(int []a)
	{
	for(int i=0; i<a.length;i++) {
		if(a[i]%2==0)
		{
			System.out.println(a[i]);
		}
	}
	
		
	}
	
    //3 finding maximum number in the array
    public static void maxEle(int a[])
	{
		int max = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			
				
			}
		}
		System.out.println(max);
		
	}
    
    
	public static void minEle( int a[])
	{

		int min = Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min = a[i];
			
				
			}
		}
		System.out.println(min);
		
	}	
	
	
	// 5 maxium and minium sum of array
	public static void maxMinSum(int []a)
	  {
		
		int maxSum=Integer.MIN_VALUE;
		int minSum = Integer.MAX_VALUE;
		int totalSum = 0;
		
		for(int i=0;i<a.length;i++)
		{
			totalSum = totalSum+a[i];
		}
		for(int i= 0;i<a.length;i++)
		{
			int sum = totalSum-a[i];
			
			minSum = Math.min(minSum, sum);
			maxSum = Math.max(maxSum, sum);
		}
		System.out.println("minimum sum:"+minSum);
		System.out.println("maximum sum:"+maxSum);
			
		
	  }
	
	  //5 other code for finding min and max sum
	   static void minMax(int []a) {
		   int Totalsum = 0;
			int sum =0;
			int min =Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			for(int i=0;i<a.length;i++)
			{
				Totalsum = Totalsum+a[i];		
			}
	 		 for(int i = 0;i<a.length;i++)
	 		 {
	 			 sum = Totalsum-a[i];
	 			System.out.println(sum+" ");
	 			
	 			if(sum>max)
	 			{
	 				max = sum;
	 			}
	 			else 
	 				if(sum<min)
	 				{
	 					min = sum;
	 				}
	 		 }
			System.out.println("maximum number :" +max);
			System.out.println("minmun number :"+min);
			
		   
	   }
	
	   // 6 counting repeating number in array
       static void countR(int []a){
		
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the number to count");
		int k = scan.nextInt();

		int count=0;
	   for(int i=0;i<a.length;i++)
	   {
		   if(a[i]==k)
		   {
			   count++;
		   }
		  
	   }
	   System.out.println(count);   
	}
       
       
       
       //7 product of array except in same row
       //ex: 1 2 3 4 5 ==120 60 40 30 24
       
     static  void product(int[]a){
    	  long prod = 1;
    	  for(int i=0;i<a.length;i++)
    	  {
    		 prod = prod*a[i]; 
    	  }
    	   
    	 long[]res= new long [a.length];
    	 for(int i = 0;i<res.length;i++)
    	 {
    		 res[i]= prod/a[i]; 
    	 }
    	 
    	 for(int i=0;i<res.length;i++)
    	 {
    		 System.out.print(res[i]+" ");
    	 }
    	  
       }
     
     // 8 minimum value accurance and count 
      
     static  void minOccurance(int []a)
     {
    	 
    	 int min = Integer.MAX_VALUE;
    	 int count =0;
    	 for(int i=0;i<a.length;i++)
    	 {
    		 if(min>a[i])
    		 {
    			 min = a[i];
    		 }
    	 }
    	 
    	 for(int i=0;i<a.length;i++)
    	 {
    		 if(min==a[i])
    		 {
    			 count++;
    		 }
    	 }
    	 
    	 System.out.println(min);
    	 System.out.println(count);
    	 
     }
     
     //9 finding second largest number from the array
     
    static void secondLargest(int []a)
     {
    	int s1 = Integer.MIN_VALUE, f1=Integer.MIN_VALUE; 
    	for(int i = 0;i<a.length;i++)
    	{
    		if(a[i]>f1)
    		{
    			s1 = f1;
    			f1 = a[i];
    		}
    		else if(a[i]>s1 && a[i]!=f1)
    		{
    			s1 = a[i];
    		}
    	}
    	
    	System.out.println(s1);
     }
     //10 finding  missing number from array
     static void missingNumber(int []a)
     {
    	int arrsum = 0;
    	int numsum = 0;
    	for(int i=0;i<a.length;i++)
    	{
    		arrsum = arrsum+a[i];
    	}
    	 
    	int n = a.length+1;
    	numsum = n*(n+1)/2;
    	
    	int sum = numsum-arrsum;
    	System.out.println(sum);
    	 
     }
     
     //11 print number count and number
      static  void  printNumberCount(int a[])
     {
    	int count =1;
    	for (int i= 0; i<a.length-1;i++)
    	{
    		if(a[i]==a[i+1])
    		{
    			count++;
    		}
    		else 
    		{
    			System.out.println(a[i]+"--"+count);
    			count =1 ;
    		}
    	}
    	System.out.println(a[a.length-1]+"--"+count);
     }
      
      
      //12 find the number ocuur max 
    static void  maxOccur(int []a)
     {
    	int count =1;
    	int max =0;
    	int ele =0;
    	 for(int i=0;i<a.length-1;i++)
 		{
 			if(a[i]==a[i+1])
 			{
 				count++;
 			}
 			
 			else 
 			{
 				if(count>max) {
 					max=count;
 					ele= a[i];
 								
 				}
 					
 				count = 1;
 			}
 		
 		}
 		if(count>max) {
 			max=count;
 			ele= a[a.length-1];
 						
 		}
 		System.out.println(ele);

 		
 		
     }
     
     
     
    
    
    
}
