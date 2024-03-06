package Assignment1;
import java.util.Scanner;
public class farenhrittocecius {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		float celius = ((n-32)*5f)/9;
		System.out.printf("%.4f",celius);

	}

}
