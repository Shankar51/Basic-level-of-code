import java.util.Scanner;

public class ArmstromgNumber {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n=scan.nextInt();
	int t1=n;
	int length=0;
	
	while(t1!=0) {
		length =length+1;;
		t1= t1/10;
	}
	int t2=n;
	int arm=0;
	while(t2!=0) {
		
		int rem=t2%10;
		int mul=1;
		
		
		for(int i=0;i<length;i++) {
			mul=mul*rem;
		}
		
		arm=arm+mul;
		t2=t2/10;
		
	}
	if(n==arm) {
		System.out.println("armstrom num");
	}else {
		System.out.println("not armstrom");
	}
	
	
	}
	

}
