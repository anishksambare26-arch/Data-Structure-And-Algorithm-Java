## Day 08 - Rotate Array

# Problem
Rotate an array to the right by `k` positions.

# Approach
- Take the array and rotation count as input.
- Use `k % n` to handle rotations greater than the array size.
- Create a new array to store the rotated elements.
- Place each element at index `(i + k) % n`.

# Concepts  I Learned
- Array indexing
- Modulo (`%`) operator
- Array rotation
- `Arrays.toString()`

## Examples
**Input:**
```text
Array: [1, 2, 3, 4, 5]
k = 2
```
**Output:**
```text
[4, 5, 1, 2, 3]
```
