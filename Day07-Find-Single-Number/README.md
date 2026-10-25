# Day 07 – Find Single Number

# Problem
Find the number that appears only once.

# Approach
I used the XOR (`^`) operator to find the single number. XOR  cancels the  duplicate numbers and leaves the unique number as the result.

# Concepts I Learned:XOR (`^`) Operator

- `a ^ a = 0` — XOR of the same numbers is 0.
- `a ^ 0 = a` — XOR with 0 leaves the number unchanged.

# Example

**Input:** `[4 4 5 6 7 7 6]`

**Output:** `5`




