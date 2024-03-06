package string1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enetr the String");
		String s = scan.next();
		String rev="";
		for(int i = s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
			
		}
		
		
//		calling is palindrome method
		System.out.println(isPalindrome(s));

	}
	
	static Boolean isPalindrome(String s) {
		
		int i=0,j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;	
	}
	
}
