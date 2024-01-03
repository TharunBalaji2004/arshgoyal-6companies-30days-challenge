# LC 216. Combination Sum III

## Problem

Find all valid combinations of k numbers that sum up to n such that the following conditions are true:

- Only numbers 1 through 9 are used.
- Each number is used at most once.

Return a list of all possible valid combinations. The list must not contain the same combination twice, and the combinations may be returned in any order.

Example 1:

>Input: k = 3, n = 7
Output: [[1,2,4]]
Explanation:
1 + 2 + 4 = 7
There are no other valid combinations.

Example 2:

>Input: k = 3, n = 9
Output: [[1,2,6],[1,3,5],[2,3,4]]
Explanation:
1 + 2 + 6 = 9
1 + 3 + 5 = 9
2 + 3 + 4 = 9
There are no other valid combinations.

Example 3:

>Input: k = 4, n = 1
Output: []
Explanation: There are no valid combinations.
Using 4 different numbers in the range [1,9], the smallest sum we can get is 1+2+3+4 = 10 and since 10 > 1, there are no valid combination.
 

Constraints:

`2 <= k <= 9`

`1 <= n <= 60`

## Approach & Solution

1. Recursive Exploration:

- The helper function explores combinations of size k to find those that sum up to the target n.
- It starts with an empty list (list) and tries adding numbers from start to 9.

2. Base Case:

- If the size of the current combination (list) reaches k, it checks if the sum is equal to the target (n).
- If yes, it adds the combination to the result (ans).

3. Recursive Calls:

- For each number from start to 9, it adds the number to the combination and makes a recursive call with an updated sum and the next possible starting number (i+1).
- This explores all possible combinations.

4. Backtracking:

- After the recursive call, the last element is removed from the combination (list) to backtrack and try the next possibility.

## Time & Space Complexity

- TC: O(9^k)
- SC: O(k)

## Submission

- https://leetcode.com/problems/combination-sum-iii/submissions/1135691769