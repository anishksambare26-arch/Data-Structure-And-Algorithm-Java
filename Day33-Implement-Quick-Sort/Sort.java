public class Sort {
    public static void quick(int[] arr, int low, int high) {
          // Check if the array has more than one element
        if (low < high) {
            // Find the correct position of the pivot
            int pivotIndex = partition(arr, low, high);
              // Sort the left side of the pivot
            quick(arr, low, pivotIndex - 1);
            // Sort the right side of the pivot
            quick(arr, pivotIndex + 1, high);
        }
    }
    public static int partition(int[] arr, int low, int high) {
         // Select the last element as the pivot
        int pivot = arr[high]; 
          // Initialize i to track elements smaller than pivot
        int i = low - 1; 

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
         // Place the pivot in its correct sorted position
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i; 
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 8, 5, 2, 4, 1, 7};
        // Call Quick Sort to sort the entire array
        quick(arr, 0, arr.length - 1);
         // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
