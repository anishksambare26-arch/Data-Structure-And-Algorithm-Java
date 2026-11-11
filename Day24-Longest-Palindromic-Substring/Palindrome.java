public class Palindrome {
    public static String longest(String s) {
         // Handle null or empty string
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        // Check every character as a possible center of a palindrome
        for (int i = 0; i < s.length(); i++) {
            int len1 = expand(s, i, i);
            int len2 = expand(s, i, i + 1);
            int len = Math.max(len1, len2);
             // Update start and end if a longer palindrome is found
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }
    public static int expand(String s, int left, int right) {
        // Continue expanding while characters match and indices are valid
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
    public static void main(String[] args) {
        System.out.println(longest("babad")); // bab ya aba
        System.out.println(longest("cbbd"));  // bb
    }
}
