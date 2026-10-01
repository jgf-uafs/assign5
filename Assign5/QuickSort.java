

public class QuickSort {

	public static void main(String[] args) {
		int[] array = {3,1,8,7,6,2,4,9,5};
		
		showArray(array);
		quickSort(array);
		showArray(array);
		
	}
	
	public static void showArray(int[] theArray) {
		int index;
		
		System.out.printf("[");
		for(index=0;index<theArray.length;index++) {
			if(index!=0) {
				System.out.printf(", ");
			}
			System.out.printf("%d",theArray[index]);
		}
		System.out.printf("]\n");
	}
	
	public static void quickSort(int[] array) {
		//**********************************************
		//*  Class Wrapper for the recursive quickSort *
		//**********************************************
		quickSort(array, 0, array.length-1);
	}
	
	public static void quickSort(int[] array, int left, int right) {
		if(right - left > 1) {
			int rIndex = 0;
			int lIndex = -1;
			int pivot = right;
			boolean sorted = true;
			for(int i = 1; i < array.length; i++) {
				if(array[i - 1] > array[i] ) { sorted = false; }
			}
			
			for(int i = 0; i < right + 1; i++) {
				if(array[rIndex] < array[pivot]) {
					lIndex++;
					swap(array, rIndex, lIndex);
				}
				rIndex++;
			}
			lIndex++;
			swap(array, lIndex, pivot);
			pivot = lIndex;
			
			if(!sorted) {
				quickSort(array, 0, pivot - 1);
				quickSort(array, pivot + 1, array.length - 1);
			}
		}
		
	}
	
	public static void swap(int[] array, int left, int right) {
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}
	

}
