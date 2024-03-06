package Assignment1;
import java.util.Scanner;
public class surfaceareaofcylinder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int h = scan.nextInt();
		float area = 2*3.142f*r*(r+h);
		System.out.printf("%.4f",area);

	}

}
