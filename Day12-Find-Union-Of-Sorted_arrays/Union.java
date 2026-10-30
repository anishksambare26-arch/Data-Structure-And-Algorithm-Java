import java.util.*;
public class Union {

    // Method to find the union of two sorted arrays
    public static List<Integer> union(int[] a, int[] b) {

        // Two pointers to traverse both arrays
        int i = 0, j = 0;

        // ArrayList to store the unique elements
        List<Integer> ans = new ArrayList<>();

        // Traverse both arrays until one array ends
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                if (ans.isEmpty() || ans.get(ans.size()-1) != a[i])
                    ans.add(a[i]);
                i++;
            } else {
                if (ans.isEmpty() || ans.get(ans.size()-1) != b[j])
                    ans.add(b[j]);
                j++;
            }
        }

        // Add remaining elements of array a
        while (i < a.length) {
            if (ans.isEmpty() || ans.get(ans.size()-1) != a[i])
                ans.add(a[i]);
            i++;
        }
        // Add remaining elements of array b
        while (j < b.length) {
            if (ans.isEmpty() || ans.get(ans.size()-1) != b[j])
                ans.add(b[j]);
            j++;
        }

        // Return the final union
        return ans;
    }
    public static void main(String[] args) {

        // Two sorted input arrays
        int[] a = {1,2,2,3,3};
        int[] b = {2, 2, 4, 6};

        // Call the union method
        List<Integer> result = union(a, b);

        // Print the final result
        System.out.println(result);
    }
}


