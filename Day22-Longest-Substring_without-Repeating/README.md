# Day22-Longest Substring Without Repeating Characters

## Problem
Given a string `s`, find the length of the longest substring that contains no repeating characters.

## Approach
- Used a HashSet to store unique characters.
- Applied the Sliding Window technique using two pointers (`left` and `right`).
- If a duplicate character is found, remove characters from the left until the duplicate is removed.
- Update the maximum length whenever a longer substring is found.

## Concepts Learned
- HashSet
- Sliding Window
- Two Pointers
- Duplicate Detection
- String Manipulation

# Example
Input:
```java
s = "12313"
```
Output:
```text
3
```


