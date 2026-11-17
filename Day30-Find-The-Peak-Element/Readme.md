# Day 30-Find Peak Element 

## Problem 
Given an array of integers, find the index of a peak element.

## Approach 
How it works:
1. Initialize `low = 0` and `high = nums.length - 1`.
2. Find the middle index using `mid = low + (high - low) / 2`.
3. Compare `nums[mid]` with `nums[mid + 1]`.
4. If `nums[mid] < nums[mid + 1]`, move to the right half.
5. Otherwise, search in the left half, including `mid`.
6. When `low == high`, return that index.

## Concepts Learned
- Binary Search
- Peak Element
- Divide and Conquer
- Optimizing search operations
- Time and Space Complexity

## Example
 Input:
```
int[] num1 ={2,4,3,6,5};
```
Output:
```
Peak index --> 3
```
