public class Square {
    public static int root(int x) {
        // If x is 0 or 1 its square root is the number itself
        if (x == 0 || x == 1) {
            return x;
        }
        // Initialize the Binary Search range
        int low = 1;
        int high = x;
        int ans = 0;
        // Continue searching while the range is valid
        while (low <= high) {
            int mid = low + (high - low) / 2;
            // Calculate square using long to avoid integer overflow
            long square = (long) mid * mid;
            // If the square is equal to x, return mid
            if (square == x) {
                return mid;
            // If the square is smaller than x
            } else if (square < x) {
                ans = mid;
                low = mid + 1;
            } else {
                // Search in the left half
                high = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(root(1));  
        System.out.println(root(8));  
        System.out.println(root(16)); 
        System.out.println(root(36)); 
    }
}


