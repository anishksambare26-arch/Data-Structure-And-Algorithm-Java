public class Position {
    public static int[] search(int[] nums, int target) {
        int first = find(nums, target, true);
        int last = find(nums, target, false);
        return new int[]{first, last};
    }

    private static int find(int[] nums, int target, boolean First) {
        int low = 0, high = nums.length - 1, ans = -1;
        // Continue searching while the search space is valid
        while (low <= high) {
            // Calculate the middle index
            int mid = low + (high - low) / 2;
            // Check if the middle element is the target
            if (nums[mid] == target) {
                ans = mid;
                
                // If finding the first occurrence, search left
                if (First) high = mid - 1;
                else low = mid + 1;
            } else if (nums[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int[] res = search(nums, 8);
        System.out.println("[" + res[0] + ", " + res[1] + "]"); // [3, 4]
        int[] res2 = search(nums, 6);
        System.out.println("[" + res2[0] + ", " + res2[1] + "]"); // [-1, -1]
    }
}
