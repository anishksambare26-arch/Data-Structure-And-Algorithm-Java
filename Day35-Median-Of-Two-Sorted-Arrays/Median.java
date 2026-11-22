import java.util.*;

public class Median {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {6,7,8,9,10};
        System.out.println("Test : " + findMedianSortedArrays(nums1, nums2)); 
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
         // Always perform binary search on the smaller array
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;
        int low = 0, high = m;
        
        // Perform binary search on the first array
        while (low <= high) {
            // Find the middle partition of the first array
            int partition1 = (low + high) / 2;
            // Calculate the partition of the second array
            int partition2 = (m + n + 1) / 2 - partition1;
            // Find the largest element on the left side of nums1
            int maxLeft1 = (partition1 == 0) ? Integer.MIN_VALUE : nums1[partition1 - 1];
            // Find the smallest element on the right side of nums1
            int minRight1 = (partition1 == m) ? Integer.MAX_VALUE : nums1[partition1];
            // Find the largest element on the left side of nums2
            int maxLeft2 = (partition2 == 0) ? Integer.MIN_VALUE : nums2[partition2 - 1];
            // Find the smallest element on the right side of nums2
            int minRight2 = (partition2 == n) ? Integer.MAX_VALUE : nums2[partition2];

            // Check whether the left partition elements
            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
                 // If total elements are even, take the average
                if ((m + n) % 2 == 0) {
                   return ((double) Math.max(maxLeft1, maxLeft2)+ Math.min(minRight1, minRight2)) / 2.0;
                } else {
                    return Math.max(maxLeft1, maxLeft2);
                }
            } else if (maxLeft1 > minRight2) {
                high = partition1 - 1;
            } else {
                low = partition1 + 1;
            }
        }
        return 0.0;
    }
}
