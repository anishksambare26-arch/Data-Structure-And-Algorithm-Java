# Day31-Find Square Root Using Binary Search

## Problem Statement
Given a non-negative integer `x`, find and return the integer square root of `x`.

## Approach
Instead of checking every number one by one, we use Binary Search to find the integer square root efficiently.

1. Handle the base cases where `x` is 0 or 1.
2. Initialize `low = 1` and `high = x`.
3. Calculate the middle value using `mid = low + (high - low) / 2`.
4. Calculate `mid * mid` using `long` to prevent integer overflow.
5. If the square equals `x`, return `mid`.
6. If the square is smaller than `x`, store `mid` in `ans` and search the right half.
7. If the square is greater than `x`, search the left half.
8. Return `ans` when the loop ends.

## Concepts Learned
- Binary Search
- Search Space Reduction
- Integer Square Root
- Handling Integer Overflow using `long`
- Maintaining the Best Possible Answer

## Example
Input:
```
x = 8
```
Output:
```text
2
```


