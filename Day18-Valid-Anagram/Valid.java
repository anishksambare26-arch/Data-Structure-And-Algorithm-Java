public class Valid {
    public static boolean Anagram(String s, String t) {
        // If lengths are different then they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }
         // Create an array of 26 elements to count letters
        int[] count = new int[26];
        // Traverse both strings  character by character
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        // Check whether all character counts are zero
        for (int num : count) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(Anagram("rat", "cat"));         
        System.out.println(Anagram("listen", "silent"));   
        System.out.println(Anagram("talent","latent"));
    }
}


