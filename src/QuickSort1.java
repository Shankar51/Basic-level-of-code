
public class QuickSort1 {

	public static void main(String[] args) {
		int []arr= {15,32,7,13,12,16,34,18,11};
		int len=arr.length;
		QuickSort1 q = new QuickSort1();
		q.quickSortrecursion(arr,0,len-1);
		printArray(arr);
		
	}
	
	 int partision(int[]arr,int min, int max) {
		int pivot=arr[(min + max)/2];
		while(min<=max) {
			while(arr[min]<pivot) {
				min++;
			}
			while(arr[max]>pivot) {
				max--;
			}
			if(min<=max) {
				int temp=arr[min];
				arr[min]=arr[max];
				arr[max]=temp;
				min++;
				max--;
			}
		}
		return min;
	}
	 void quickSortrecursion(int[] arr, int min,int max){
		int par = partision(arr, min, max);
		if(min<par-1) {
			quickSortrecursion(arr,min,par-1);
		}if(par<max) {
			quickSortrecursion(arr,par,max);

		}
		
	}
	static void printArray(int[]arr){
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
