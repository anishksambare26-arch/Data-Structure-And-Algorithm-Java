# Day 11 - Merge Two Arrays and Sort

# Problem 
Given two integer arrays, combine all their elements into a single array and sort the elements in increasing order.

# Approach
1. Create a new array to store the elements of both arrays.
2. Copy all elements from the first array into the new array.
3. Copy all elements from the second array into the new array.
4. Use `Arrays.sort()` to sort the combined array in increasing order.
5. Print the final sorted array.

# Concepts  Learned
- Array traversal using `for` loops.
- Combining two arrays into one.
- Using `Arrays.sort()` to sort elements in increasing order.
- Returning an array from a method.
- Printing arrays using `Arrays.toString()`.

# Example
Input:
```text
Array 1: [2, 4, 1, 3, 5]
Array 2: [8, 6, 7, 9, 10]
```
Output:
```text
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
```

