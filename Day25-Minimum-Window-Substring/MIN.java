public class MIN {
    public static String minWindow(String s, String t) {
        // If s is smaller than t, a valid window is impossible
        if (s.length() < t.length()) return "";
        // Array to store the frequency of each character
        int[] need = new int[128];
        // Count how many times each character appears in t
        for (char c : t.toCharArray()) need[c]++;
         // Initialize two pointers for the sliding window
        int left = 0, right = 0, required = t.length();
        int minLen = Integer.MAX_VALUE, minStart = 0;
        // Expand the window until we reach the end of s
        while (right < s.length()) {
            char c = s.charAt(right);
            if (need[c] > 0) required--;
            need[c]--;
            right++;
            // If all required characters are found, try shrinking the window
            while (required == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    minStart = left;
                }
                char lc = s.charAt(left);
                need[lc]++;
                if (need[lc] > 0) required++;
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }

    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC")); 
    }
}
