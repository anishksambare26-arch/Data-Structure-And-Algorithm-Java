import java.util.*;

public class Anagram {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        // Loop through each string in the array
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            if (!map.containsKey(sorted)) {
                 // Create a new ArrayList for this group of anagrams
                map.put(sorted, new ArrayList<>());
            }
             // Add the original string to its matching anagram group
            map.get(sorted).add(s);
        }
         // Return all the grouped anagrams as a list of lists
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String[] strs = {"eat","tea","abc","bca","cab"};
        System.out.println(groupAnagrams(strs));
    }
}
