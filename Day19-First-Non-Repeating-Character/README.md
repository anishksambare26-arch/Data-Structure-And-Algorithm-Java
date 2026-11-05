## Day 19 – First Non-Repeating Character in a String

# Problem
Given a string `s`, find the index of the first non-repeating character. If no unique character exists, return `-1`.

# Approach
- Create an integer array of size 26 to store the frequency of each character.
- Traverse the string once and count the frequency of every character.
- Traverse the string again to find the first character whose frequency is exactly 1.
- If no such character is found, return `-1`.

# Concepts Learned
- Frequency counting using an array..
- Converting characters into array indices using `-'a'`.
- Two-pass traversal.
- Returning an index based on a condition.

# Example
Input:
```text
"recess"
"moments"
"aabbcc"
```
Output:
```text
0
1
-1
```



