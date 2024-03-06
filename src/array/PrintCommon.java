package array;

public class PrintCommon {

	public static void main(String[] args) {
		int[]ar1= {3,5,6,8,9};
		int[]ar2= {2,3,4,6,7,8};
//		----o/p---3 6 8----
		int i=0,j=0;
		while(i<ar1.length && j<ar2.length) {
			if(ar1[i]==ar2[j]) {
				System.out.print(ar1[i]+" ");
				i++;
				j++;
			}else if(ar2[j]<ar1[i]) {
				j++;
			}else {
				i++;
			}
		}

	}

}
