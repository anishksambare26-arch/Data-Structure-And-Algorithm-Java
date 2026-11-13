# Day26-Binary Search

## Problem
Given a sorted integer array and a target value, find the index of the target using Binary Search.

## Approach
1. Initialize two pointers: `low` at the beginning and `high` at the end of the array.
2. Calculate the middle index using `mid = low + (high - low) / 2`.
3. If the middle element equals the target, return its index.
4. If the middle element is smaller than the target, search the right half.
5. If the middle element is greater than the target, search the left half.
6. Repeat until the target is found or the search range becomes empty.
7. Return `-1` if the target is not found.

## Concepts Learned
1. Binary Search algorithm
2. Low, High and Mid pointers
3. Searching in sorted arrays
4. Reducing the search space by half
5. Efficient searching techniques

## Example
Input:
```
nums = {-1, 0, 3, 5, 9, 12}
target = 9
```
Output:
```text
4
```

