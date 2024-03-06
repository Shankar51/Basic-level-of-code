package array;

import java.util.Scanner;

//----i/p----
//enter the size of 1st array
//5
//3 5 7 9 13
//enter the size of 2nd array
//8
//1 2 3 4 9 15 17 19

//----o/p---
//1 2 3 3 4 5 7 9 9 13 15 17 19 

public class MorgeSortedArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the size of 1st array");
		int n = scan.nextInt();
		int []ar1=new int[n];
		for(int i=0;i<ar1.length;i++) {
			ar1[i]=scan.nextInt();
		}
				
		System.out.println("enter the size of 2nd array");
		int m = scan.nextInt();
		int []ar2=new int[m];	
		for(int i=0;i<ar2.length;i++) {
			ar2[i]=scan.nextInt();
		}
		
		int[] res = sortedArray(ar1,ar2);

		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
	}
	
	
	
	
	
	static int[] sortedArray(int ar1[],int ar2[]) {
		int[]res=new int[ar1.length+ar2.length];
		int i=0,j=0,k=0;
		while(i<ar1.length && j<ar2.length) {
			if(ar1[i]<ar2[j]) {
				res[k]=ar1[i];
				i++;
				k++;
			}else {
				res[k]=ar2[j];
				j++;
				k++;
			}
		}
		while(i<ar1.length) {
			res[k]=ar1[i];
			i++;
			k++;
		}
		while(j<ar2.length) {
			res[k]=ar2[j];
			j++;
			k++;
		}
		return res;
	}

}
