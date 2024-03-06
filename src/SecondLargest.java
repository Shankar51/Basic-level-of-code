
public class SecondLargest {

	public static void main(String[] args) {
		int []arr = {24,98,96, 15,10, 24};
		
		int fs=Integer.MAX_VALUE;
		int ss = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(fs>arr[i]) {
				ss=fs;
				fs=arr[i];
			}else if(ss>arr[i] && ss!=fs) {
				ss=arr[i];
			}
		}
		System.out.println(ss);
		
	}

}
