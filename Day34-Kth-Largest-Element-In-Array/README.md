# Day34-Kth Largest Element In Array

## Problem 
Find the Kth largest element in an integer array using a Min Heap.

## Approach
1. Create a Min Heap using Java's `PriorityQueue`.
2. Traverse through the array and insert each element into the heap.
3. If the heap size becomes greater than `k`, remove the smallest element using `poll()`.
4. After processing all elements, the heap contains the K largest elements.
5. Return the smallest element using `peek()`, which is the Kth largest element.

##  Concepts learned
- PriorityQueue
- Min Heap
- Array Traversal
- `add()` – Insert an element
- `poll()` – Remove the smallest element
- `peek()` – Get the smallest element

## Example

Input:
```
nums = [3, 2, 1, 5, 6, 4]
k = 2
```
Output:
```
5
```

