public class Prefix {
    public static String Main(String[] strs) {

        // Check if the array is null 
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Assume the first string is the common prefix
        String prefix = strs[0];

        // Start comparing from the second string
        for (int i = 1; i < strs.length; i++) {

            // Check if the current string starts with the prefix
            while (strs[i].indexOf(prefix) != 0) {

                // Remove the last character from the prefix
                prefix = prefix.substring(0, prefix.length() - 1);

                // If the prefix becomes empty then no common prefix exists
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        // Return the longest common prefix
        return prefix;
    }
    public static void main(String[] args) {
        String[] test1 = {"flower", "flat", "flight"};
        System.out.println(Main(test1));
        String[] test2 = {"dog", "cat", "car"};
        System.out.println(Main(test2));
        String[] test3 = {"car", "car", "car"};
        System.out.println(Main(test3));
    }
}
