# Day36-Implement A Singly Linked List 

## Problem
Implement a Singly Linked List in Java and perform basic operations:

## Approach
- Create a `Node` class containing `data` and `next`.
- Use a `head` reference to point to the first node.
- **Add:** Traverse to the last node and connect the new node.
- **Add First:** Make the new node point to the current head and update head.
- **Delete:** Find the node before the target node and skip the node to be deleted.
- **Print:** Traverse the list until `null` is reached.

## Concepts Learned
- Singly Linked List
- Node Creation using Classes and Constructors
- Head and Next References
- Insertion at Beginning and End
- Deletion by Value
- Linked List Traversal
- Time Complexity of Linked List Operations

## Example
Input:
```
list.add(10);
list.add(20);
list.add(30);
list.addFirst(5);
list.print();

list.delete(20);
list.print();
```
Output:
```
5 -> 10 -> 20 -> 30 -> NULL
5 -> 10 -> 30 -> NULL
```
