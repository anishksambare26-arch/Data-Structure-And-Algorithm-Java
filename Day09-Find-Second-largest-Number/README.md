## Day 09 - Find the Second Largest Element

# Problem 
Find the second-largest distinct element in an array of integers.

# Approach
1. Take the array size and elements as input.
2. Sort the array in ascending order.
3. Store the largest element.
4. Traverse the array backwards, skipping elements equal to the largest.
5. Print the first distinct element found. If no such element exists, print a message.

# Concepts Learned
- Arrays and array indexing
- Sorting using Arrays.sort()
- Backward traversal using a for loop
- Handling duplicate elements
- Using return to exit the program

# Example

**Case 1: Second largest element exists**
Input: `[10, 5, 8, 10, 7, 9]`
Output: `Second largest: 9`
**Case 2: No second largest element exists**
Input: `[5, 5, 5]`
Output: `No second largest found`


