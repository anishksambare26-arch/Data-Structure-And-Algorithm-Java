import java.util.*;
public class Duplicate {
    // Method to find all duplicate numbers 
    public static List<Integer> find(int[] nums) {
        // List to store duplicate numbers
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            
            int index = Math.abs(nums[i]) - 1;

            if (nums[index] < 0) {
                // Add the duplicate number to the answer list
                answer.add(Math.abs(nums[i]));
            } else {
                // Mark the number 
                nums[index] = -nums[index];
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] nums = {3,6,4,5,6,7,8,9,7,10};
        System.out.println(find(nums)); 
    }
}
