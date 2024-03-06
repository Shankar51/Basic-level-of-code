package Assignment1;
import java.util.Scanner;
public class dollortorupee {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int dollor = scan.nextInt();
		float rate = scan.nextFloat();
		float rupee = rate*dollor;
		System.out.println(rupee);
		
	}

}
