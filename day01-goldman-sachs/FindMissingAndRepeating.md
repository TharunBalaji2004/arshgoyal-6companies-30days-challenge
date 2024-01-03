# GFG Find Missing and Repeating

## Problem

Given an unsorted array Arr of size N of positive integers. One number 'A' from set {1, 2,....,N} is missing and one number 'B' occurs twice in array. Find these two numbers.

Example 1:

> Input:
N = 2
Arr[] = {2, 2}
Output: 2 1
Explanation: Repeating number is 2 and 
smallest positive missing number is 1.

Example 2:

>Input:
N = 3
Arr[] = {1, 3, 3}
Output: 3 2
Explanation: Repeating number is 3 and 
smallest positive missing number is 2.

Constraints:

`2 ≤ N ≤ 10^5`

`1 ≤ arr[i] ≤ N`

## Approach & Solution

- Count the frequency of elements, and determine which has freq=0 and freq=2

- Then save it in an array, and return 

## Time & Space Complexity

- TC: O(N)
- SC: O(N)

## Submission

