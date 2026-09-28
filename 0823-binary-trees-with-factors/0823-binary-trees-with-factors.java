import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        Arrays.sort(arr);
        int MOD = 1_000_000_007;
        Map<Integer, Long> dp = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            long count = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] % arr[j] == 0) {
                    int right = arr[i] / arr[j];
                    if (dp.containsKey(right)) {
                        count = (count + dp.get(arr[j]) * dp.get(right)) % MOD;
                    }
                }
            }
            dp.put(arr[i], count);
        }

        long totalTrees = 0;
        for (long count : dp.values()) {
            totalTrees = (totalTrees + count) % MOD;
        }

        return (int) totalTrees;
    }
}