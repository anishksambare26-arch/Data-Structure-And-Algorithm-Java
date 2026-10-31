## Day 13 – Product of Array Except Self

# Problem
Given an integer array `nums`, return an array `answer` such that `answer[i]` is equal to the product of all elements of the array except `nums[i]`.

# Approach
Used the **Prefix Product and Suffix Product** approach.

1. Created an answer array.
2. Calculated prefix products from left to right.
3. Calculated suffix products from right to left.
4. Multiplied prefix and suffix products to get the final answer.

# Concepts Learned
- Prefix Product
- Suffix Product
- Array Traversal (Left to Right and Right to Left)
- Solving array problems without division

# Example

Input:
```text
nums = [2, 4, 6, 8, 1]
```
Output:
```text
[192, 96, 64, 48, 384]
```
