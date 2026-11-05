## Day18-Valid Anagram

# Problem
Given two strings `s` and `t`, determine whether `t` is an anagram of `s`.

# Approach
- First, check whether both strings have the same length.
- Create an integer array of size 26 to count the frequency of each lowercase alphabet character.
- Increase the count for every character in the first string.
- Decrease the count for every character in the second string.
- Finally, check whether all array elements are zero.
- If all counts are zero, the strings are anagrams.

# Concepts Learned
- String manipulation in Java
- Character frequency counting
- Integer arrays
- Enhanced for loop
- Time and space complexity

# Example
Input:
```text
s = "anagram"
t = "nagaram"
```
Output:
```text
true
```
Input:
```text
s = "rat"
t = "cat"
```
Output:
```text
false
```
