class Solution {
    public int minimumTotal(List<List<Integer>> t) {
        int n = t.size();
        int[] dp = new int[n + 1];
        
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dp[j] = t.get(i).get(j) + Math.min(dp[j], dp[j + 1]);
            }
        }
        return dp[0];
    }
}