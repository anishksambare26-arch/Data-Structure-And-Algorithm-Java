import java.util.*;
class Max {
    public static void main(String[] args) {
         // Given array of numbers
        int[] nums = {-2, 1, -3, 4, 3, 2, 1, -5, 4};
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int start = 0, end = 0, tempStart = 0;
        
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            
            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
         // If currentSum becomes negative, discard it and start fresh
            if (currentSum < 0) {
                currentSum = 0;
                tempStart = i + 1; 
            }
        }
        System.out.println("Max Sum = " + maxSum);
        // Print the actual subarray that gives the maximum sum
        System.out.print("Subarray = [");
        for (int i = start; i <= end; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("]");
    }
}
