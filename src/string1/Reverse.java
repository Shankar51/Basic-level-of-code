package string1;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enetr the String");
		String s = scan.nextLine();
		String rev="";
		for(int i = s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);

//		calling the method ReverseString
//		System.out.println(ReverseString(s));

	}

	static String ReverseString(String s) {

		String t = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			t = t + s.charAt(i);
		}
		return t;
	}

}
