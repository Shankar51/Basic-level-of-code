package string;

import java.util.Scanner;

public class practise {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		// String result=reverse(s);
		// String result=reverse1(s);
		// String result=reverse(s);
		// System.out.println(isplaindrome(s));
		// int result = indexPresent(s);
		// System.out.println(result);
		// System.out.println(countSpace(s));
		// System.out.println(countWord(s));
		// System.out.println(countVowels(s));
		// countAll(s);
		// String res = removeSpecial(s);
		// System.out.println(replaceL(s));
		//System.out.println(removeVowels(s));
		
		change(s);
		
	}

	// 1 reversing the string
	static String reverse(String s) {
		String t = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			t = t + s.charAt(i);
		}
		return t;
	}

	// 2 reversing string in multiple word
	static String reverse1(String s) {
		String t = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			t = t + s.charAt(i);
		}
		return t;
	}

	// 3 plaindrome
	static boolean isplaindrome(String s) {
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

	// 4 string present in the index
	static int indexPresent(String s) {
		int ch = 'o';
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ch) {
				return i;
			}
		}
		return -1;
	}
	// 5 count the number of space present in string

	static int countSpace(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				count++;
			}
		}
		return count;
	}

	// count the word present in sentence
	static int countWord(String s) {
		int count = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
				count++;
			}
		}
		return count + 1;
	}

	// count vowel
	static int countVowels(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				count++;
			}
		}
		return count;
	}

	// count the vowels ,consonat, numric value and special characters
	static void countAll(String s) {
		int nc = 0;
		int vc = 0;
		int cc = 0;
		int sc = 0;
		for (int i = 0; i < s.length(); i++) {
			int ch = s.charAt(i);
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
		System.out.println("numric value:" + nc);
		System.out.println("vowels:" + vc);
		System.out.println("consonenat:" + cc);
		System.out.println("special characters:" + sc);
	}

	// lower to upper case
	static String toUpperCase(String s) {
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

	// to lower cass
	static String toLowerCase(String s) {
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

	// swap lower_to_upper and upper to lower
	static String bothLH(String s) {
		String t = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				t = t + (char) (ch + 32);
			} else if (ch >= 'a' && ch <= 'z') {
				t = t + (char) (ch - 32);
			}
		}
		return t;
	}

	// remove special character from string
	static String removeSpecial(String s) {
		String t = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) {
				t = t + ch;
			}

		}
		return t;
	}

	// replace the lower case is to #
	static String replaceL(String s) {
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

	// REMOVE VOWELAS
	static String removeVowels(String s) {
		String t = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U')) {
				t = t + ch;
			}
		}
		return t;
	}
	// changing ..shankar=sh#ank#ar
	
	static void change(String s) {
		String t="";
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(s.charAt(i)=='a') {
				t=t+"#"+ch;
			}else {
				t=t+ch;
			}
		}
		System.out.println(t);
		
	}

}
