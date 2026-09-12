import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // Start the backtracking process from index 0 with an empty subset
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, int[] nums, List<Integer> current, List<List<Integer>> result) {
        // Every state in the decision tree is a valid subset, so we copy and add it immediately
        result.add(new ArrayList<>(current));

        for (int i = start; i < nums.length; i++) {
            // 1. Make a choice: add the current element to the subset
            current.add(nums[i]);

            // 2. Explore: move to the next index to prevent reusing the same element
            backtrack(i + 1, nums, current, result);

            // 3. Undo the choice: remove the element to backtrack and try other paths
            current.remove(current.size() - 1);
        }
    }
}
