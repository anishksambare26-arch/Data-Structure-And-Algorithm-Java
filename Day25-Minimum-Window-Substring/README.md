# Day 25-Minimum Window Substring

## Problem
Given two strings `s` and `t`, find the smallest substring of `s` that contains all the characters of `t`, including duplicate characters.

## Approach

1. Created a frequency array to count characters in `t`.
2. Used two pointers, `left` and `right`, to maintain a sliding window.
3. Expanded the window using the `right` pointer until all required characters were found.
4. Shrunk the window using the `left` pointer to find the smallest valid substring.
5. Updated the minimum window length and starting position whenever a smaller valid window was found.

## Concepts Learned
- Sliding Window Technique
- Character Frequency Array
- Expanding and Shrinking Windows
- Minimum Length Substring

## Example
Input:
```java
s = "ADOBECODEBANC"
t = "ABC"
```
Output:
```text
BANC
```



```
