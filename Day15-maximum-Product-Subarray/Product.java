public class Product {

    public static int max(int[] nums) {
        // Get the length of the array
        int n = nums.length;
        // Store the maximum product ending at the current position
        int Max = nums[0];
        int Min = nums[0];
        int answer = nums[0];

        // Start checking the array from the second element
        for (int i = 1; i< n;i++) {
            int num = nums[i];
            int tempMax = Max;

            Max = Math.max(num, Math.max(tempMax * num, Min * num));
            Min = Math.min(num, Math.min(tempMax * num, Min * num));

            // Update the final answer if we find a bigger product
            answer = Math.max(answer,Max);
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] nums1 = {2,4,-6,8};
        System.out.println(max(nums1)); 

    }
}
