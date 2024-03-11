package practise;

import java.util.Scanner;

public class SplitsMethod {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = "hi my name is shankar";
		
		String[] arr= s.split(" ");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
