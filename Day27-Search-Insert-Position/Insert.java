public class Insert {
    public static int searchInsert(int[] nums, int target) {
        // Initialize the starting and ending positions
        int low = 0;
        int high = nums.length - 1;
        // Continue searching while the search range is valid
        while (low <= high) {
            int mid = low + (high - low) / 2;
            // If the target is found, return its index
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        System.out.println(searchInsert(nums, 5)); // 2
        System.out.println(searchInsert(nums, 2)); // 1
        System.out.println(searchInsert(nums, 7)); // 4
        System.out.println(searchInsert(nums, 0)); // 0
    }
}
