import java.util.*;
class rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Take the size of the array
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        //Create an array of size n
        int[] nums = new int[n];

        //Take array as input
        System.out.println("Enter numbers: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        //Take the number of positions to rotate it
        System.out.print("Enter k: ");
        int k = sc.nextInt();

        // Reduce k if it is greater than or equal to n
        k = k % n;

        // Create a new array to store the rotated elements
        int[] ans = new int[n];

        // Place each element at its new rotated index
        for (int i = 0; i < n; i++) {
            ans[(i + k) % n] = nums[i];
        }
        System.out.println(Arrays.toString(ans));
        sc.close();
    }
}
