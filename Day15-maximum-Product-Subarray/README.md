## Day 15 – Maximum Product Subarray

# Problem
Given an integer array `nums`, find the contiguous subarray that has the largest product and return that product.

# Approach
- Initialize `Max`, `Min`, and `answer` with the first element.
- Traverse the array starting from the second element.
- Store the previous maximum using `tempMax`.
- Update `Max` to track the maximum product ending at the current position.
- Update `Min` to track the minimum product ending at the current position.

# Concepts Learned
- Dynamic Programming
- Maximum and Minimum Product Tracking
- Handling Negative Numbers

# Example

Input:
```java
nums = {2, 4, -6, 8}
```
Output:
```text
8
```

