## Day 17 - Check If String Is Palindrome

# Problem
Write a Java program to check whether a given string is a palindrome or not.

# Approach
- Calculate the length of the string using `length()`.
- Initially assume that the string is a palindrome using a boolean variable.
- Use a for loop to check characters from both ends.
- Compare `str.charAt(i)` with `str.charAt(len-1-i)`.
- Finally, print whether the string is a palindrome or not.

# Concepts Learned
- `length()` method
- `charAt()` method
- Boolean variables

# Example
Input:
```text
Enter string: madam
```
Output:
```text
madam is Palindrome
```




