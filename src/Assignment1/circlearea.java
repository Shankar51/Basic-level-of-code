package Assignment1;
import java.util.Scanner;
public class circlearea {
public static void main(String [] args) {
	Scanner scan = new Scanner(System.in);
	int radius = scan.nextInt(); 
	float area = 3.142f*radius*radius;
	System.out.printf("%.4f",area);
}
}
