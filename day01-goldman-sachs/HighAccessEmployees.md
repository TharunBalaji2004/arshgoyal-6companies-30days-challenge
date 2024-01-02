# LC 2933. High Access Employees

## Problem

You are given a 2D 0-indexed array of strings, access_times, with size n. For each i where 0 <= i <= n - 1, access_times[i][0] represents the name of an employee, and access_times[i][1] represents the access time of that employee. All entries in access_times are within the same day.

The access time is represented as four digits using a 24-hour time format, for example, "0800" or "2250".

An employee is said to be high-access if he has accessed the system three or more times within a one-hour period.

Times with exactly one hour of difference are not considered part of the same one-hour period. For example, "0815" and "0915" are not part of the same one-hour period.

Access times at the start and end of the day are not counted within the same one-hour period. For example, "0005" and "2350" are not part of the same one-hour period.

Return a list that contains the names of high-access employees with any order you want.

Example 1:

>Input: access_times = [["a","0549"],["b","0457"],["a","0532"],["a","0621"],["b","0540"]]
Output: ["a"]
Explanation: "a" has three access times in the one-hour period of [05:32, 06:31] which are 05:32, 05:49, and 06:21.
But "b" does not have more than two access times at all.
So the answer is ["a"].

Example 2:

>Input: access_times = [["d","0002"],["c","0808"],["c","0829"],["e","0215"],["d","1508"],["d","1444"],["d","1410"],["c","0809"]]
Output: ["c","d"]
Explanation: "c" has three access times in the one-hour period of [08:08, 09:07] which are 08:08, 08:09, and 08:29.
"d" has also three access times in the one-hour period of [14:10, 15:09] which are 14:10, 14:44, and 15:08.
However, "e" has just one access time, so it can not be in the answer and the final answer is ["c","d"].

Example 3:

>Input: access_times = [["cd","1025"],["ab","1025"],["cd","1046"],["cd","1055"],["ab","1124"],["ab","1120"]]
Output: ["ab","cd"]
Explanation: "ab" has three access times in the one-hour period of [10:25, 11:24] which are 10:25, 11:20, and 11:24.
"cd" has also three access times in the one-hour period of [10:25, 11:24] which are 10:25, 10:46, and 10:55.
So the answer is ["ab","cd"].


Constraints:

- `1 <= access_times.length <= 100`
- `access_times[i].length == 2`
- `1 <= access_times[i][0].length <= 10`
- `access_times[i][0] consists only of English small letters.`
- `access_times[i][1].length == 4`
- `access_times[i][1] is in 24-hour time format.`
- `access_times[i][1] consists only of '0' to '9'.`


## Approach & Solution

**1. Create a Map to Group Access Times by Employee:**

- Use a HashMap<String, List<String>> named employeeAccessMap to group access times by employee name.
- The key is the employee name, and the value is a list of access times.

**2. Populate the Map:**

- Iterate through the accessTimes list.
- For each entry in accessTimes, extract the employee name and access time.
- If the employee is not already in the map, create an entry with an empty list.
- Add the access time to the list corresponding to the employee.

**3. Check for High Access Employees:**

- Iterate through the entries in employeeAccessMap.
- For each employee, sort their access times in ascending order.
- Iterate through the sorted access times.
- Check if the time difference between the current access time and the access time two positions ahead is less than or equal to 99.
- If the condition is met, add the employee's name to the result and break out of the loop.
- This ensures that an employee is added to the result only once.

**4. Return the Result:**

The result is a list of employee names who satisfy the condition.
Convert the result to a HashSet to eliminate duplicate entries.
Convert the HashSet back to a List and return the final result.

## Time & Space Complexity

- TC: O(N * M logN)
- SC: O(N * M)

## Submission

- https://leetcode.com/problems/high-access-employees/submissions/1134652727