# Day 2 — Reverse an Array

## Problem
Reverse the elements of an integer array in place without using an additional array.

## Approach
Used the two-pointer technique:
- Initialize `i` at the first index.
- Initialize `j` at the last index.
- Swap `array[i]` and `array[j]`.
- Move `i` forward and `j` backward.
- Repeat while `i < j`.

## Concepts Learned
- Array indexing
- Two-pointer technique
- Swapping elements using a temporary variable
- In-place array manipulation

## Example
Input: [1,2,3,4,5,6,7,8]
Output: [8,7,6,5,4,3,2,1]
