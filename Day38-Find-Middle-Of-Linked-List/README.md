# Day38-Find Middle of a Linked List

## Problem
Given the head of a singly linked list, find and return the middle node's value.

## Approach
- Initialize two pointers, `slow` and `fast`, at the head of the linked list.
- Move the `slow` pointer one step at a time.
- Move the `fast` pointer two steps at a time.
- Continue until `fast` reaches the end of the linked list.
- When the loop stops, the `slow` pointer will be at the middle node.
- Return `slow.data`.

## Concept Learned
- Singly Linked List
- Node Traversal
- Slow and Fast Pointer Technique
- Tortoise and Hare Algorithm
- Finding the middle node in a single traversal
- Time Complexity: O(n)
- Space Complexity: O(1)

## Example
**Input:**
```
1 → 2 → 3 → 4 → 5 → 6 → 7
```
Output:
```
Middle is: 4
```
