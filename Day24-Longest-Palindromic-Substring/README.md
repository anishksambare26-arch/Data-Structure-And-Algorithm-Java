# Day24-Longest Palindromic Substring 

## Problem
Given a string `s`, find the longest substring that is a palindrome.


## Approach: Expand Around Center
- Consider every character as a possible center of a palindrome.
- Check for odd-length palindromes using `expand(s, i, i)`.
- Check for even-length palindromes using `expand(s, i, i + 1)`.
- Expand outward while both characters are equal.
- Update the starting and ending indices whenever a longer palindrome is found.
- Return the longest palindromic substring.

## Concepts Learned
- Two-pointer approach
- Odd-length and even-length palindromes
- String manipulation in Java
- `substring()` and `Math.max()` methods

## Example
Input:
```text
s = "babad"
```
Output:
```text
bab
```


