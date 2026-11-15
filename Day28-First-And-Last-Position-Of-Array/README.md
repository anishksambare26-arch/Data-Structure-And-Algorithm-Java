# Day 28-Find First and Last Position of Element

## Problem
Given a sorted array of integers and a target value then find the starting and ending position of the target in the array.

## Approach
- First Binary Search: Finds the first occurrence by continuing to search in the left half.
- Second Binary Search: Finds the last occurrence by continuing to search in the right half.
- Store the matching index in `ans`.

## Concepts Learned
- Binary Search
- Modified Binary Search
- First and Last Occurrence
- Boolean Parameters

## Example
Input:
```
nums = [5, 7, 7, 8, 8, 10]
target = 8
```
Output:
```text
[3, 4]
```
