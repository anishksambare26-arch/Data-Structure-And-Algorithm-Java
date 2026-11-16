public class search {
    public static int search(int[] nums, int target) {
        // Set the starting and ending of the array
        int low = 0;
        int high = nums.length - 1;

        // Continue searching while the search is valid
        while (low <= high) {
            // Find the middle index without causing integer overflow
            int mid = low + (high - low) / 2;
            // If the middle element matches the target, return its index
            if (nums[mid] == target) {
                return mid;
            }
            // Check if the left half of the array is sorted
            if (nums[low] <= nums[mid]) {
                // Check if the target lies within the sorted left half
                if (target >= nums[low] && target < nums[mid]) {
                    // Search in the left half
                    high = mid - 1;
                } else {
                    // Search in the right half
                    low = mid + 1;
                }
            }
            else {

                // Check if the target lies within the sorted right half
                if (target > nums[mid] && target <= nums[high]) {
                    // Search in the right half
                    low = mid + 1;
                } else {
                    // Search in the left half
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Target 1 -> " + search(nums, 1));
        System.out.println("Target 3 -> " + search(nums, 3));
        System.out.println("Target 6 -> " + search(nums, 6));
    }
}
