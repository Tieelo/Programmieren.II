package ProgrammierungI.Algorithmen;

public class Quicksort_refactored {
    public static void main(String[] args) {
        int[] toSort = { 9, -3, 5, 2, 6, 8, -6, 1, 3 };
        // int[] toSort = { 9, -3, 5, 2, 6, 8, -6, 62, 60 };
        quickSort(toSort, 0, toSort.length - 1);
    }

	public static void quickSort(int arr[], int begin, int end) {
	    if (begin < end) {
	        int partitionIndex = partition(arr, begin, end);

	        quickSort(arr, begin, partitionIndex-1);
	        quickSort(arr, partitionIndex+1, end);
	    }
	}
	
	private static int partition(int arr[], int begin, int end) {
	    int pivot = arr[end];
	    int i = (begin-1);

        System.out.println("Now, pivot is arr[" + end + "] = " + pivot);

	    for (int j = begin; j < end; j++) {
	        if (arr[j] <= pivot) {
	            i++;
	            swap(arr, i, j);
	        }
	    }

        // Pivot wird ans Ende des aktuellen Sub-Arrays gesetzt: logisch, da alle diese Elemente kleiner sind
	    swap(arr, i+1, end);

	    printArray(arr);
	    System.out.println("present pivot is arr[" + (i+1) + "] = " + arr[i+1]);
	    return i+1;
	}

    private static void swap(int arraySwap[], int a, int b) {
        int size = arraySwap.length;
        if (a >= 0 && a < size && b >= 0 && b < size) {
            int swapTemp = arraySwap[a];
            arraySwap[a] = arraySwap[b];
            arraySwap[b] = swapTemp;
        }
    }
	
	private static void printArray(int arr[]) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();	}
}
