# Day40-Find Start of a cycle

## Problem
Given the head of a linked list, determine whether a cycle exists. 

## Approach
- Use Floyd's Cycle Detection Algorithm (Slow and Fast Pointers).
- Initialize two pointers, `slow` and `fast`, at the head.
- Move `slow` one step and `fast` two steps at a time.
- If both pointers meet, a cycle is detected.
- Move `slow` back to the head.
- Move both pointers one step at a time.
- Their next meeting point is the starting node of the cycle.
- If `fast` reaches `null`, no cycle exists.

## Concepts Learned
- Linked List
- Floyd's Cycle Detection Algorithm
- Slow and Fast Pointer Technique
- Two Pointer Approach
- Finding the Starting Point of a Cycle
- Time Complexity: O(n)
- Space Complexity: O(1)

## Example
Input:
```
head = [3, 2, 0, -4]
```
Output:
```
Cycle starts at: 2
```
