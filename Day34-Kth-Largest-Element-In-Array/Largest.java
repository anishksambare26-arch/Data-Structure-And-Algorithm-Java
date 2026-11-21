import java.util.*;
    
    public class Largest {
        public static int findKthLargest_Heap(int[] nums, int k) {
        // Create a Min Heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // Traverse through each element of the array
        for (int num : nums) {
            // Add the current element to the heap
            minHeap.add(num);
            // If heap size becomes greater than k
            if (minHeap.size() > k) {
                // Remove the smallest element
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
    public static void main(String[] args) {
        // Given array
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println("Using Heap: " +
            findKthLargest_Heap(nums, k));
    }
}
