package string1;

import java.util.Scanner;

public class ArrayString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String s = scan.nextLine();
		String[] ar = splits(s.trim());
//	1. i/p-- how are you	 o/p-- how are you	
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();

//	2.i/p-- how are you  o/p-- woh era uoy
		for (int i = 0; i < ar.length; i++) {
			System.out.print(reverse(ar[i]) + " ");
		}
		System.out.println();

//	3.i/p-- how are you  o/p-- you are how
		for (int i = ar.length - 1; i >= 0; i--) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();

//	4.i/p-- how are you  o/p-- uoy era woh
		for (int i = ar.length - 1; i >= 0; i--) {
			System.out.print(reverse(ar[i]) + " ");
		}
		System.out.println();

//	5.i/p-- India Is My Country  o/p-- India5 Is2 My2 Country7
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + ar[i].length() + " ");
		}
		System.out.println();
//	6.i/p-- India Is My Country  o/p-- Is India Country My
		for (int i = 1; i < ar.length; i = i + 2) {
			System.out.print(ar[i] + " " + ar[i - 1] + " ");			
		}
		
		System.out.println();
//	7.i/p-- India Is My Country Hi o/p-- Is India Country My Hi
		for (int i = 1; i < ar.length; i = i + 2) {
			System.out.print(ar[i] + " " + ar[i - 1] + " ");
			
		}
		if(ar.length%2==1) {
			System.out.println(ar[ar.length-1]);
		}
		System.out.println();
//	8.i/p-- India Is My Country  o/p-- India Country Is My
		for(int i=0,j=ar.length-1;i<j;i++,j--) {
			System.out.print(ar[i]+" "+ar[j]+" ");
		}
		System.out.println();
//	9.i/p-- India Is My Country  o/p-- yrtnuoc india ym is 
			for(int i=0,j=ar.length-1;i<j;i++,j--) {
				System.out.print(reverse(ar[j])+" "+ar[i]+" ");
			}

	}

	static String[] splits(String s) {
		String t = "";
		int j = 0;
		int wordCount = countWord(s);
		String[] ar = new String[wordCount];

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch != ' ') {
				t = t + ch;
			} else if (t.length() > 0) {
				ar[j] = t;
				j++;
				t = "";
			}

		}
		ar[j] = t;
		return ar;
	}

	static int countWord(String s) {
		int count = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
				count++;
			}
		}
		return count + 1;
	}

	static String reverse(String s) {
		String t = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			t = t + s.charAt(i);
		}
		return t;
	}

}
