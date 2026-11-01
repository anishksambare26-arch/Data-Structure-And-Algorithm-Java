## Day 14 - Find Duplicates in an Array

# Problem
Given an array of integers, find all the numbers that appear more than once in the array.

# Approach
- Created an ArrayList to store duplicate numbers.
- Used `Math.abs()` to get the absolute value of each number.
- Converted each number into its corresponding array index.
- Used negative marking to check whether a number was visited before.

# Concepts Learned
- ArrayList
- Math.abs()
- Array Indexing
- Array Traversal

# Example

Input:
```java
nums = {3,6,4,5,6,7,8,9,7,10};
```
Output:
```text
[6, 7]
```
