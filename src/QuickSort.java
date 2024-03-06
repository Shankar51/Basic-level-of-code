 
public class QuickSort {

	public static void main(String[] args) {
		int[] ar = { 15, 9, 7, 13, 12, 16, 4, 18, 11 };
		int len = ar.length;
		
		QuickSort qs=new QuickSort();
		qs.quickSortRecursion(ar, 0, len-1);
		PrintArray(ar);
		
		
	}

	int partition(int[] ar, int low, int high) {
		int pivot = ar[(low + high) / 2];

		while (low <= high) {
			while (ar[low] < pivot) {
				low++;
			}
			while (ar[high] > pivot) {

				high--;
			}

			if (low <= high) {
				int temp = ar[low];
				ar[low] = ar[high];
				ar[high] = temp;
				low++;
				high--;
			}
		}
		return low;
	}
	void quickSortRecursion(int[] ar, int low,int high) {
		int par = partition(ar,low,high);
		if(low<par-1) {
			quickSortRecursion(ar,low,par-1);
		}
		if(par<high) {
			quickSortRecursion(ar,par,high);

		}
		
	}
	static void PrintArray(int[]ar) {
		for(int i:ar) {
			System.out.print(i+" ");
		}
	}

}
