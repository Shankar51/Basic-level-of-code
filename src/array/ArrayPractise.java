package array;

import java.util.Scanner;

public class ArrayPractise {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = scan.nextInt();
		int[] ar = new int[n];

		System.out.println("enter the element of array");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
//		evenIndex(ar);
//		evenElement(ar);
//		System.out.println(sum(ar));
//		System.out.println(product(ar));
//		System.out.println(maximum(ar));
//		System.out.println(manimum(ar));
//		leastMaxSum(ar);
//		 productOfN(ar);
//		largestMaxOccurance(ar);
//		secondLargest(ar);
//		missingNum(ar);
//		cRepeatingElement(ar);
//		eleOccurMost(ar);
//		smallestRepearatedNum(ar);
//		allRepeatedNum(ar);		
//		maxSumOfPairs(ar);
//		maxProductOfPairs(ar);
//		printPattern(ar);
//		allPairs(ar);
//		sumEqualsK(ar);
//		sumEqualsPrime(ar);

	}

//	1.element present at even index 
	static void evenIndex(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			if (i % 2 == 0) {
				System.out.println(ar[i]);
			}
		}

	}

//	2.even element from the array	
	static void evenElement(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 0) {
				System.out.print(ar[i] + " ");
			}
		}

	}

//	3.sum of element present in array
	static int sum(int[] ar) {
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum = sum + ar[i];
		}
		return sum;

	}

//	4.product of element present in array
	static int product(int[] ar) {
		int prod = 1;
		for (int i = 0; i < ar.length; i++) {
			prod = prod * ar[i];
		}
		return prod;

	}

//	5.maximum element present in array
	static int maximum(int[] ar) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
			}

		}
		return max;
	}

//	5.minimum element present in array
	static int manimum(int[] ar) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < min) {
				min = ar[i];
			}

		}
		return min;
	}

//	6.maximum and minimum sum of sub-array(length-1)
	static void leastMaxSum(int[] ar) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < min) {
				min = ar[i];
			}

		}
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
			}

		}
		for (int i = 0; i < ar.length; i++) {
			sum = sum + ar[i];
		}

		System.out.println(sum - min);
		System.out.println(sum - max);

	}

//	7.product i/p--{2,5,1,4,3}---o/p--{60,24,120,30,40}	
	static void productOfN(int[] ar) {
		long p = 1;
		for (int i = 0; i < ar.length; i++) {
			p = p * ar[i];
		}
		long[] res = new long[ar.length];
		for (int i = 0; i < res.length; i++) {
			res[i] = p / ar[i];
		}
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}

	}

//	8.Occurance of largest number in array	 
	static void largestMaxOccurance(int[] ar) {
		int count = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
			}
		}

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == max) {
				count++;
			}
		}
		System.out.println("maximum number is: " + max + "--" + count);
	}

//	9.Second largest number in array
	static void secondLargest(int[] ar) {
		int FL = Integer.MIN_VALUE;
		int SL = Integer.MAX_VALUE;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > FL) {
				SL = FL;
				FL = ar[i];
			} else if ((ar[i] > SL) && (ar[i] != FL)) {
				SL = ar[i];
			}
		}
		System.out.println(SL);
	}

//	10.missing number from an array
	static void missingNum(int[] ar) {
		int arrSum = 0;
		int numSum = 0;
		for (int i = 0; i < ar.length; i++) {
			arrSum = arrSum + ar[i];
		}

		int n = ar.length + 1;
		numSum = n * (n + 1) / 2;

		System.out.println(numSum - arrSum);
	}

//	11.count each repeating element and element also
	static void cRepeatingElement(int[] ar) {
		int count = 1;
		for (int i = 0; i < ar.length - 1; i++) {
			if (ar[i] == ar[i + 1]) {
				count++;
			} else {
				System.out.println(ar[i] + "-" + count);
				count = 1;
			}
		}
		System.out.println(ar[ar.length - 1] + "-" + count);

	}

//	12.print the element which has occur most
	static void eleOccurMost(int[] ar) {
		int count = 1;
		int max = 0;
		int ele = 0;
		for (int i = 0; i < ar.length - 1; i++) {
			if (ar[i] == ar[i + 1]) {
				count++;
			} else {
				if (max < count) {
					max = count;
					ele = ar[i];
				}
				count = 1;
			}
		}
		if (max < count) {
			max = count;
			ele = ar[ar.length - 1];
		}
		System.out.println(ele);
	}

	static void allRepeatedNum(int[] ar) {
		int count = 1;
		for (int i = 0; i < ar.length - 1; i++) {
			if (ar[i] == ar[i + 1]) {
				count++;
			} else {
				if (count > 1) {
					System.out.println(ar[i]);
				}
				count = 1;
			}

		}
		if (count > 1) {
			System.out.println(ar[ar.length - 1]);
		}
	}

//	13.given a sorted array in the descending order Find the smallest repeating number	
	static void smallestRepearatedNum(int[] ar) {
		for (int i = ar.length - 1; i >= 0; i--) {
			if (ar[i] == ar[i - 1]) {
				System.out.println(ar[i]);
				break;
			}
		}
	}

//	14.print the pairs sum which gives the maximum value
	static void maxSumOfPairs(int[] ar) {
		int fl = Integer.MIN_VALUE, sl = Integer.MIN_VALUE;
		int last = Integer.MAX_VALUE, secl = Integer.MAX_VALUE;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > fl) {
				sl = fl;
				fl = ar[i];
			} else if (sl < ar[i]) {
				sl = ar[i];
			}
		}
		System.out.println(fl + sl);
	}

//	15.print the maximum product possible from any 2 number in the array
	static void maxProductOfPairs(int[] ar) {
		int fl = Integer.MIN_VALUE, sl = Integer.MIN_VALUE;
		int last = Integer.MAX_VALUE, secl = Integer.MAX_VALUE;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > fl) {
				sl = fl;
				fl = ar[i];
			} else if (sl < ar[i]) {
				sl = ar[i];
			}
		}
		for (int i = 0; i < ar.length; i++) {
			if (last > ar[i]) {
				secl = last;
				last = ar[i];
			} else if (secl > ar[i]) {
				secl = ar[i];
			}
		}
		int p1 = fl * sl;
		int p2 = last * secl;
		if (p1 > p2) {
			System.out.println(p1);
		} else {
			System.out.println(p2);
		}

	}

//	16.print *,$,# between every number as---i/p--7 3 2 4 9 5 and --o/p--7*3&2#4&9*5
	static void printPattern(int[] ar) {
		for (int i = 0; i < ar.length - 1; i++) {
			if (ar[i] % 2 == 1 & ar[i + 1] % 2 == 1) {
				System.out.print(ar[i] + "*");
			} else if (ar[i] % 2 == 0 & ar[i + 1] % 2 == 0) {
				System.out.print(ar[i] + "#");

			} else {
				System.out.print(ar[i] + "&");
			}
		}
		System.out.println(ar[ar.length - 1]);
	}

//	18.print all pairs of given array
	static void allPairs(int[]ar) {
				
		for(int i=0;i<ar.length-1;i++) {
			for(int j=i+1;j<ar.length;j++) {
				System.out.println(ar[i]+" "+ar[j]);				
			}
		}
	}

//	19.find the sum of all pairs which is equal to K
	static void sumEqualsK(int[] ar) {
		int k = 7;
		for (int i = 0; i < ar.length - 1; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] + ar[j] == k) {
					System.out.println(ar[i] + " " + ar[j]);
				}
			}
		}
	}

//	20.print all pairs whose sum is prime,if their are no pairs print-1
	static void sumEqualsPrime(int[] ar) {
		boolean found=false;
		for (int i = 0; i < ar.length - 1; i++) {
			for (int j = i + 1; j < ar.length; j++) {
			int	sum=ar[i]+ar[j];
				if(isPrime(sum)) {
					System.out.println(ar[i]+" "+ar[j]);
					found=true;
				}
			}
		}
		if(found==false) {
			System.out.println(-1);
		}
		
	}
	static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}


}
