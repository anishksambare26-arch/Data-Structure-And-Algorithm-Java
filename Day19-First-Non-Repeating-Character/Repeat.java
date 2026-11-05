public class Repeat {
    public static int firstUniqChar(String s) {
        // Create an array to store character 
        int[] count = new int[26];
        // Count how many times each character appears
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
         // Find the first character whose count is 1
        for (int i = 0; i < s.length(); i++) {
            // Check if the current character appears only once
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        // Return -1 if no unique character is found
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("recess")); 
        System.out.println(firstUniqChar("moments")); 
        System.out.println(firstUniqChar("aabbcc")); 
    }
}
