## Day21-Longest Common Prefix 

# Problem Statement
Given an array of strings, find the longest common prefix shared by all the strings.

# Approach
1. Take the first string as the initial prefix.
2. Compare the prefix with every other string.
3. Use `indexOf()` to check whether the current string starts with the prefix.
4. If it doesn't match, remove the last character using `substring()`.
5. Repeat until a common prefix is found.

# Concepts Learned
- String Arrays
- indexOf()
- substring()
- Horizontal Scanning

# Example
Input:
```java
String[] strs = {"flower", "flow", "flight"};
```
Output:
```text
fl
```




