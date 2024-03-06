package Assignment1;
import java.util.Scanner;
public class perimeterofrectangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int weidth = scan.nextInt();
		int perimeter = 2*(length+weidth);
		System.out.println(perimeter);


	}

}
