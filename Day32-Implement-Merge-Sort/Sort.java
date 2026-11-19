public class Sort{
    public static void mergeSort(int[] arr, int low, int high) {
        // Base condition: Stop when only one element is left
        if (low >= high) {
            return; 
        }
        // Find the middle index of the array
        int mid = low + (high - low) / 2;
        // Recursively sort the left half
        mergeSort(arr, low, mid);
        // Recursively sort the right half
        mergeSort(arr, mid + 1, high);
        // Merge both sorted halves into one sorted array
        merge(arr, low, mid, high);
    }
    public static void merge(int[] arr, int low, int mid, int high) {
        // Create a temporary array to store sorted elements
        int[] temp = new int[high - low + 1];
        int i = low;      
        int j = mid + 1;  
        int k = 0;       
        // Compare elements from both halves and store the smaller one
        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        // Copy any remaining elements from the left half
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // Copy any remaining elements from the right half
        while (j <= high) {
            temp[k++] = arr[j++];
        }
        
        // Copy the sorted elements back into the original array
        for (int p = 0; p < temp.length; p++) {
            arr[low + p] = temp[p];
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,7,1,3,8,4,6,5,9,10};
        // Call mergeSort to sort the entire array
        mergeSort(arr, 0, arr.length - 1);
        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
    }
}
