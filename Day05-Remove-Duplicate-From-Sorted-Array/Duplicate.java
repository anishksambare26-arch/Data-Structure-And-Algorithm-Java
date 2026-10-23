import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,1,2,3,4,4};
         // Sort the array first
        Arrays.sort(array); 
        int i = 0;
         // j checks every element
        for (int j = 1; j < array.length; j++) {
            // Check if the element is different
            if (array[j] != array[i]) {
                i++;
                array[i] = array[j];
            }
        }
          // Print only the unique elements
        for (int p = 0; p <= i; p++) {
            System.out.print(array[p]+" ");
        }
    }
}
