package array;

import java.util.Scanner;

public class SubArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter  the size of array");
		int n=scan.nextInt();
//		System.out.println("enter the size of subArray");
//		int size = scan.nextInt();
		int []ar = new int[n];
		System.out.println("enter the array element");
		for(int i=0;i<ar.length;i++) {
			ar[i]=scan.nextInt();
		}
//		subArray(ar,size);
//		printSubarraySum(ar,size);
//		printSumOfSubarrayEqualK(ar,size);
//		printSubarrayOfWSumEqualK(ar,size);
//		countSubarraywhoseSumK(ar,size);
//		allPossibleSubarray(ar);

	}
//	1.find the all possible subarray with given length 
	static void subArray(int []ar,int size) {
		for(int i=0;i<=ar.length-size;i++) {
			for(int j=i;j<size+i;j++) {
				System.out.print(ar[j]+" ");
			}
			System.out.println();
		}
	}
	
//	2.print all the sum of subarray
	static void printSubarraySum(int[]ar,int size) {
		for(int i=0;i<=ar.length-size;i++) {
			int sum=0;
			for(int j=i;j<size+i;j++) {
				sum = sum+ar[j];
			}
			System.out.println(sum);
		}
	
	}
	
//	3.print all possible sum which is equal to k
	static void printSumOfSubarrayEqualK(int[]ar,int size) {
		int k=7;
		for(int i=0;i<=ar.length-size;i++) {
			int sum=0;
			for(int j=i;j<size+i;j++) {
				sum = sum+ar[j];
			}
			if(sum==k) {
				System.out.println(sum);	
			}
			
		}
	}

//	4.print all subarray whose sum is K
	static void printSubarrayOfWSumEqualK(int []ar,int size) {
		int k=7;
		for(int i=0;i<=ar.length-size;i++) {
			int sum=0;
			for(int j=i;j<size+i;j++) {
				sum = sum+ar[j];
			}
			if(sum==k) {
				for(int j=i;j<size+i;j++) {
					System.out.print(ar[j]+" ");
				}	
			}
			System.out.println();
			
		}
		
	}
	
//	5.count the subarray whose sum is k;
	static void countSubarraywhoseSumK(int []ar,int size) {
		int k=7;
		int count=0;
		for(int i=0;i<=ar.length-size;i++) {
			int sum=0;
			for(int j=i;j<size+i;j++) {
				sum = sum+ar[j];
			}
			if(sum==k) {
				count++;
			}			
		}
		System.out.print(count);
		
	}
	
//	6.print all possible subarray
	static void allPossibleSubarray(int[]ar) {
		for(int k=1;k<=ar.length;k++) {
			for(int i=0;i<=ar.length-k;i++) {
				for(int j=i;j<k+i;j++) {
					System.out.print(ar[j]+" ");
				}
				System.out.println();
			}
		}
	}


}
