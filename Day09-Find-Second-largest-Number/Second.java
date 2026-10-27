import java.util.*;

class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take the size of the array
        System.out.print("Enter size: ");
        int n = sc.nextInt();
         // Create an array of size n
        int[] nums = new int[n];
        System.out.println("Enter numbers: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        // Sort the array 
        Arrays.sort(nums); 
        int largest = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] != largest) {
                System.out.println("Second largest: " + nums[i]);
                return; 
            }
        }
        // If all elements are equal
        System.out.println("No second largest found");
    }
}
