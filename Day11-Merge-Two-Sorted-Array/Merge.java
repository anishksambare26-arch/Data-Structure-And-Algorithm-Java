import java.util.*;

public class Merge {

    public static int[] srt(int[] array1, int[] array2) {

        // Create a new array 
        int[] merged = new int[array1.length + array2.length];

        int k = 0;

        // Add all elements of array1
        for (int i = 0; i < array1.length; i++) {
            merged[k] = array1[i];
            k++;
        }
        // Add all elements of array2
        for (int i = 0; i < array2.length; i++) {
            merged[k] = array2[i];
            k++;
        }
        // Sort the array in increasing order
        Arrays.sort(merged);

        return merged;
    }
    public static void main(String[] args) {
        int[] array1 = {2,4,1,3,5};
        int[] array2 = {8,6,7,9,10};
        
        // Combine and sort both arrays
        int[] result = srt(array1, array2);
        
        // Print the final array
        System.out.println(Arrays.toString(result));
    }
}
