# Day 12 - Find Union of Two Sorted Arrays

# Problem 
Given two sorted arrays, find their union without repeating any elements.

The union contains all distinct elements present in either of the two arrays.

# Approach
- Initialize two pointers, `i` and `j`, for both arrays.
- Compare the elements at both pointers.
- Add the smaller element to the ArrayList if it is not already present.
- Move the corresponding pointer forward.
- Return the final ArrayList containing unique elements.

# Concepts Learned
- ArrayList in Java
- Removing Duplicate Elements
- Traversing Arrays

# Example
Input:
```java
a = [1,2,2,3,3]
b = [2,2,4,6]
```
Output:
```text
[1,2,3,4,6]
```


