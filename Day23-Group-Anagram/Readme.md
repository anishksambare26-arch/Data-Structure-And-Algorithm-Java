# Day23 - Group Anagrams 

## Problem
Given an array of strings, group the anagrams together. Anagrams are words that contain the same characters but may be arranged in a different order.

## Approach
- Created a HashMap to store sorted strings as keys and lists of original words as values.
- Converted each string into a character array using `toCharArray()`.
- Sorted the characters using `Arrays.sort()`.
- Converted the sorted character array back into a String.
- Checked whether the sorted string already existed in the HashMap.
- Added the original string to its corresponding anagram group.
- Returned all grouped anagrams.

## Concepts Learned
- HashMap and ArrayList
- Character arrays
- Arrays.sort()
- Key-value pairs

## Example
Input:
```java
strs = {"eat", "tea", "abc", "bca", "cab"}
```
Output:
```text
[[eat, tea], [abc, bca, cab]]
```


