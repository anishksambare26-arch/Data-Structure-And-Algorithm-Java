# Day35-Median of Two Sorted Arrays

## Problem 
Given two sorted integer arrays `nums1` and `nums2`, find the median of the two sorted arrays.

## Approach
1. First, make sure binary search is performed on the smaller array.
2. Calculate the partition positions of both arrays.
3. Find the maximum element on the left side and the minimum element on the right side of each array.
4. Check whether the left partition elements are smaller than or equal to the right partition elements.
5. If the total number of elements is even, calculate the average of the two middle elements.
6. If the total number of elements is odd, return the maximum element from the left partition.
7. If the partition is incorrect, adjust the binary search boundaries.

## Concepts Learned
- Binary Search
- Array Partitioning
- Two Sorted Arrays
- Median Calculation

## Example
Input:
```
nums1 = [1, 2, 3, 4, 5]
nums2 = [6, 7, 8, 9, 10]
```
Output:
```
5.5
```



