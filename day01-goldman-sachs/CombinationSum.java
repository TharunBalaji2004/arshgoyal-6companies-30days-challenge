import java.util.*;

public class CombinationSum {

    private void helper(List<Integer> list, List<List<Integer>> ans, int k, int n, int start) {
        // Base case - When size(list) == k elements
        if (list.size() == k) {
            // Check whether n = 0, then list is a valid combination
            if (n == 0) ans.add(new ArrayList<>(list));
            return;
        }

        // Recursive case - Try with numbers from 1 to 9
        for (int i=start;i<=9;i++) {
            list.add(i);

            // Try from (i+1) number
            helper(list, ans, k, n-i, i+1);

            // Remove last element of list, after recursive call ends
            list.remove(list.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        helper(list, ans, k, n, 1);

        return ans;
    }
    
}
