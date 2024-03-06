import java.util.Scanner;

public class ph {
	
	public static boolean isPalindrome(String s) {
		int i=0,j=s.length()-1;
		
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	String s=scan.nextLine();
	System.out.println(isPalindrome(s));
	}

}
