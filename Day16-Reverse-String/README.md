## Day 14: 
Reverse String

# Problem
Write a Java program to reverse a given string using the Two Pointer Approach.

# Approach
- Convert the input string into a character array using `toCharArray()`.
- Initialize two pointers: `i` at the beginning and `j` at the end.
- Swap the characters at both pointer positions using a temporary variable.
- Move `i` forward and `j` backward.
- Continue until both pointers meet.


# Concepts Learned
- Two Pointer Approach
- Character Array Manipulation
- Swapping Characters
- In-place String Reversal
- `toCharArray()` and `new String()`

#Example
Input:
```text
HELLO
```
Output:
```text
OLLEH
```
