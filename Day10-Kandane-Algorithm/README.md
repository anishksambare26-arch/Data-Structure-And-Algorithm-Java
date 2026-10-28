## Day 10 - Maximum Subarray Sum

# Problem Statement
Given an integer array containing positive and negative numbers, find the contiguous subarray with the maximum sum. Print both the maximum sum and the subarray.

# Approach: Kadane's Algorithm
1. Initialize `currentSum` to `0` to track the current subarray sum.
2. Initialize `maxSum` to `Integer.MIN_VALUE` to handle arrays containing negative numbers.
3. Traverse the array and add each element to `currentSum`.
4. If `currentSum` exceeds `maxSum`, update the maximum sum and record the subarray's starting and ending indices.
5. If `currentSum` becomes negative, reset it to `0` and consider the next element as a potential starting point.
6. Print the maximum sum and its corresponding subarray.

# Concepts Learned
- Kadane's Algorithm
- Maximum subarray sum
- Array traversal using loops
- Tracking subarray indices

# Example
Input:
```text
[-2, 1, -3, 4, 3, 2, 1, -5, 4]
```
Output:
```text
Max Sum = 10
Subarray = [4 3 2 1 ]
```





