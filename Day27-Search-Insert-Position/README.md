# Day27-Search Insert Position

## Problem
Given a sorted array of distinct integers and a target value,return the index if the target is found.

## Approach
- Initialize `low` to 0 and `high` to the last index.
- Calculate the middle index using `mid = low + (high - low) / 2`.
- If the middle element equals the target, return its index.
- If the middle element is smaller than the target, search the right half.
- Otherwise, search the left half.
- If the target is not found, return `low` as the insertion position.

## Concepts Learned
- Binary Search algorithm
- Sorted array traversal
- low, high, and mid pointers
- Calculating the middle index safely
- Updating search boundaries

## Example
Input:
```java
nums = [1, 3, 5, 6]
target = 5
```
Output:
```text
2
```
