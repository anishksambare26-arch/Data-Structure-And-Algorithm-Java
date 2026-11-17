public class Find {
    public static int Peak(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        // Continue searching until low and high become equal
        while (low < high) {
             // Find the middle index
            int mid = low + (high - low) / 2;
            // Check if the next element is greater than the middle element
            if (nums[mid] < nums[mid + 1]) {
                 // If increasing, search in the right half
                low = mid + 1;
            }
            
            else {
                // Otherwise, the peak may be at mid or in the left half
                high = mid;
            }
        }
        return low; 
    }

    public static void main(String[] args) {
        int[] nums1 = {2,4,3,6,5};
        System.out.println("Peak index -> " + Peak(nums1)); 

        int[] nums2 = {1,9,5,3,7};
        System.out.println("Peak index -> " + Peak(nums2)); 

        int[] nums3 = {1,2,3,4,5};
        System.out.println("Peak index -> " + Peak(nums3)); 
    }
}
