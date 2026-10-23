# Day 05 - Remove Duplicate From Sorted Array

#Problem: Given an array with duplicates, remove duplicates and print unique elements.

#Approach:
1. First sort the array using `Arrays.sort()` 
2. Use Two Pointers:
   - i = slow pointer 
   - j = fast pointer 
3. If array[j] != array[i], found new unique -> i++ and array[i] = array[j]

# What I Learned

- Learned that if array is [1,2,1,2] we must sort it first otherwise duplicate logic fails
- Learned i and j pointer method to remove duplicates without creating a new array
