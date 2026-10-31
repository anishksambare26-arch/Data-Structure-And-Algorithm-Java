import java.util.*;

public class Self {
     // Method to calculate product of array 
    public static int[] product(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        answer[0] = 1;
         // Calculate the prefix product
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }
        int suffix = 1;
        // Traverse the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Multiply prefix  with suffix 
            answer[i] = answer[i] * suffix;
            // Update suffix product
            suffix = suffix * nums[i];
        }
        return answer;
    }
    public static void main(String[] args) {
        // Input array
        int[] nums = {2,4,6,8,1};
        System.out.println(Arrays.toString(product(nums)));
    }
}
