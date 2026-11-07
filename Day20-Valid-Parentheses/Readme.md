## Day 20-Valid Parentheses

# Problem
Given a string containing brackets `()`, `{}`, and `[]`, check whether the brackets are valid.

# Approach
- Used the **Stack** data structure to store opening brackets.
- Traversed the string using a for-each loop.
- Pushed opening brackets into the stack.
- When a closing bracket appeared, checked whether it matched the top element of the stack.
- Returned `false` if brackets did not match or the stack was empty.
- At the end, checked whether the stack was empty.

# Concepts Learned
- push() and pop()
- String to Character Array
- Matching Opening and Closing Brackets

# Example
Input:
```java
"()"
"(]"
"{[]}"
"("
```
Output:
```text
true
false
true
false
```
