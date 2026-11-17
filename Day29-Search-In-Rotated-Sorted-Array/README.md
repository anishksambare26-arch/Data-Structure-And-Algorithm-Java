# Day29-Search in Rotated Sorted Array

## Problem Statement
Given an array of distinct integers that was originally sorted in ascending order but then rotated at an unknown position, find the index of a given target value.

## Approach: Modified Binary Search

- Initialize two pointers: `low` and `high`.
- Calculate the middle index.
- If the middle element matches the target, return its index.
- Check which half of the array is sorted.
- If the left half is sorted, check whether the target lies within it.
- Otherwise, search in the right half.
- If the right half is sorted, check whether the target lies within it.
- Continue until the target is found or the search range becomes empty.

## Concepts Learned
- Binary Search
- Modified Binary Search
- Rotated Sorted Arrays
- Identifying sorted halves
- Two Pointers (`low` and `high`)
- Search Space Reduction

## Example
Input:
```
int[] nums = {4, 5, 6, 7, 0, 1, 2};
```
Output:
```
Target 0 -> 4
Target 3 -> -1
Target 6 -> 2
``
