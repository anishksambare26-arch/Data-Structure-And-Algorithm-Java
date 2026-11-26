# Day39-Detect Cycle in a Linked List

## Problem
Given the head of a linked list, determine whether the linked list contains a cycle.

## Approach

- Initialize two pointers, `slow` and `fast`, at the head.
- Move the `slow` pointer one step at a time.
- Move the `fast` pointer two steps at a time.
- If both pointers meet, a cycle exists.
- If the `fast` pointer reaches `null`, no cycle exists.

## Concept Learned
- Linked List traversal
- Slow and Fast Pointer Technique
- Floyd's Cycle Detection Algorithm
- Node reference comparison (`==`)
- Time Complexity: O(n)
- Space Complexity: O(1)

## Example
Input 1:  
`1 → 2 → 3 → 4 → null`

Output:
```
No Cycle: false
```
Input 2: 
`1 → 2 → 3 → 4 → 2 ...`

Output:
```
With Cycle: true
```

