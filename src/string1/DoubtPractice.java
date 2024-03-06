package string1;

import java.util.Scanner;

public class DoubtPractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String s = scan.nextLine();

//		System.out.println(reverse(s));
//		System.out.println(isPalindrome(s));
//		System.out.println(isPalindrome1(s));
//		System.out.println(charPresent(s));
//		countSpace(s);
//		System.out.println(wordCount(s.trim()));
//		System.out.println(vowelCount(s));
//		vcnsCount(s);
//		System.out.println(ToUpperCase(s));
//		System.out.println(ToLowerCase(s));
//		System.out.println(interchange(s));
//		System.out.println(removeVowel(s));
//		System.out.println(replace(s));
//		System.out.println(trim(s));		
//		System.out.println(change(s));
//		System.out.println(SeparateNumSum(s));
//		System.out.println(SeparateNum(s));
//		System.out.println(findString(s));
//		subString(s);
//		palindromeSubString(s);
//		possibleSubString(s);
//		largestPalindrome(s);

	}

//	1.reversing String
	static String reverse(String s) {

		String t = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			t = t + s.charAt(i);
		}
		return t;

	}
//	2.checking palindrome using while loop

	static boolean isPalindrome(String s) {
		int i = 0, j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

//	3.checking palindrome using for loop
	static String isPalindrome1(String s) {
		for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
			if (s.charAt(i) != s.charAt(j)) {
				return "not palindrome";
			}
		}
		return "palindrome";
	}

//	4.checkig in given String charpresent at any index

	static int charPresent(String s) {
		char ch = 'k';
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'k') {
				return i;
			}
		}
		return -1;
	}

//	5.counting number of space present in string
	static int countSpace(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				count++;
			}
		}
		return count;
	}

//	6.wordcount
	static int wordCount(String s) {
		int count = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
				count++;
			}
		}
		return count + 1;
	}

//	7.vowel count in String
	static int vowelCount(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				count++;
			}

		}
		return count++;
	}
//	8.vowel,consonant,numberic,special character count in String

	static void vcnsCount(String s) {
		int vc = 0, cc = 0, nc = 0, sc = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch >= '0' && ch <= '9') {
				nc++;
			} else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
						|| ch == 'O' || ch == 'U') {
					vc++;
				} else {
					cc++;
				}
			} else {
				sc++;
			}
		}
		System.out.println("vowel count is :" + vc);
		System.out.println("consonant count is :" + cc);
		System.out.println("numric count is :" + nc);
		System.out.println("special character count is :" + sc);
	}

//	9.converting lower to uppercase
	static String ToUpperCase(String s) {
		String t = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				t = t + (char) (ch - 32);
			} else {
				t = t + ch;
			}
		}
		return t;
	}

//	10.converting uppercase to lowercase
	static String ToLowerCase(String s) {
		String t = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				t = t + (char) (ch + 32);
			} else {
				t = t + ch;
			}
		}
		return t;

	}

//	11.coverting upper to lower and vice-versa
	static String interchange(String s) {
		String t = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				t = t + (char) (ch + 32);
			} else if (ch >= 'a' && ch <= 'z') {
				t = t + (char) (ch - 32);
			} else {
				t = t + ch;
			}
		}
		return t;
	}

//	12.removing all the vowel from given String
	static String removeVowel(String s) {
		String t = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U')) {
				t = t + ch;
				;
			}

		}
		return t;
	}

//	13.WAP to replace lower case to #
	static String replace(String s) {
		String t = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				t = t + '#';
			} else {
				t = t + ch;
			}
		}
		return t;
	}

//	14.trim method to remove space from last and first
	static String trim(String s) {
		int si = 0, ei = 0;
		String t = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				si = i;
				break;
			}
		}
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) != ' ') {
				ei = i;
				break;
			}

		}

		for (int i = si; i <= ei; i++) {
			t = t + s.charAt(i);
		}
		return t;
	}

//	16.WAP to change---i/p--banana---o/p--b*an*an*a	
	static String change(String s) {
		String t = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a') {
				t = t + '*' + ch;
			} else {
				t = t + ch;
			}
		}
		return t;
	}

//	17.WAP to change--i/p--shan@1ka2r3---o/p--shankar6
	static String SeparateNumSum(String s) {
		String t = "";
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				t = t + ch;
			} else if (ch >= '0' && ch <= '9') {
				sum = sum + ch - 48;
			}
		}
		return t + sum;
	}

//	17.WAP to change--i/p--shan@1ka2r3---o/p--shankar123
	static String SeparateNum(String s) {
		String t1 = "";
		String t2 = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				t1 = t1 + ch;
			} else if (ch >= '0' && ch <= '9') {
				t2 = t2 + ch;
			}
		}
		return t1 + t2;
	}

//	18.checking either s2 is present in s or not 
	static String findString(String s) {
		String s2 = "shankar";
		int i = 0, j = 0;
		while (i < s.length() && j < s2.length()) {
			if (s.charAt(i) == s2.charAt(j)) {
				i++;
				j++;
			} else {
				i++;
			}

		}
		if (j == s2.length()) {
			return "YES";
		} else {
			return "NO";
		}
	}

//	19.fiding all substring with given length
	static void subString(String s) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length of sub String");
		int size = scan.nextInt();
		for (int i = 0; i <= s.length() - size; i++) {
			String t = "";
			for (int j = i; j < size + i; j++) {
				t = t + s.charAt(j);
			}
			System.out.println(t);
		}

	}

//	20.check palindrome from substring	
	static void palindromeSubString(String s) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length of sub String");
		int size = scan.nextInt();
		for (int i = 0; i <= s.length() - size; i++) {
			String t = "";
			for (int j = i; j < size + i; j++) {
				t = t + s.charAt(j);
			}
			if (isPalindrome(t)) {
				System.out.println(t);
			}
		}

	}

//	21.print all the possible substring of given string
	static void possibleSubString(String s) {
		for (int size = 1; size <= s.length(); size++) {
			for (int i = 0; i <= s.length() - size; i++) {
				String t = "";
				for (int j = i; j < size + i; j++) {
					t = t + s.charAt(j);
				}
				System.out.println(t);
			}
		}

	}

//	22.print largest palindrome from given String
	static void largestPalindrome(String s) {
		for (int size = s.length();size>0; size--) {
			for (int i = 0; i <=s.length()-size; i++) {
				String t = "";
				for (int j = i; j < size + i; j++) {
					t=t+s.charAt(j);
				}
				if(isPalindrome(t)) {
					System.out.println(t);
					return;
				}
			}
		}
	}
	
	
}
