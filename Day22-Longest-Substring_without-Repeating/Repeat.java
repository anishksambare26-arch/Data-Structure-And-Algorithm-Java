import java.util.*;

public class Repeat {
    public static int lengthOfLongestSubstring(String s) {
        // HashSet stores unique characters
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        // Right pointer moves through the string
        for (int right = 0; right < s.length(); right++) {
        char c = s.charAt(right);
            // Check if the character already exists in the set
            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            // Calculate the current window length
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("")); 
        System.out.println(lengthOfLongestSubstring("aabb"));    
        System.out.println(lengthOfLongestSubstring("12313"));         
    }
}
