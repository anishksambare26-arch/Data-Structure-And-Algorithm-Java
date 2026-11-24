# Day37-Reverse a Linked List

## Problem
Given the head of a singly linked list, reverse the linked list and return the new head.

## Approach
- Initialize three pointers: `prev`, `curr`, and `next`.
- Set `prev = null` and `curr = head`.
- Traverse the linked list using a while loop.
- Store the next node in `next` to avoid losing the remaining list.
- Reverse the current node's link using `curr.next = prev`.
- Move `prev` and `curr` one step forward.
- Repeat until `curr` becomes null.
- Finally, update `head = prev` to make the last node the new head.

## Concepts Learned
- Singly Linked List
- Node and pointer manipulation
- Three-Pointer Technique
- Iterative Linked List Reversal

## Example
Input:
```text
5 -> 10 -> 20 -> 30 -> NULL
```
Output:
```
30 -> 20 -> 10 -> 5 -> NULL
```
