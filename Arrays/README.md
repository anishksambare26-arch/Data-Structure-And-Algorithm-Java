## Day 04 - Move Zeros To End

**Problem:**
Move all zeros to the end of array while maintaining order of non-zero elements

**Approach: Two Pointer**
1. Use pointer `p = 0` for next non-zero position
2. Traverse array, if element != 0, place it at p and p++
3. Fill the remaining positions with 0

**Example:**
Input: [0,1,0,2,0,3]
Output: [1,2,3,0,0,0]
