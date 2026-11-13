public class Binary {
    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
          // Continue searching while the search range is valid
        while (low <= high) {
             // Find the middle index of the current search range
            int mid = low + (high - low) / 2;
             // If the middle element matches the target then return its index
            if (nums[mid] == target) return mid;
            // search in the right half of the array
            else if (nums[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        System.out.println(search(nums, 9)); 
        System.out.println(search(nums, -1)); 
    }
}
