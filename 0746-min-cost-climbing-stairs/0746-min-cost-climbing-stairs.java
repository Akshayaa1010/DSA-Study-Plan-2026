class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int a = 0, b = 0;
        for (int c : cost) {
            int next = c + Math.min(a, b);
            a = b;
            b = next;
        }
        return Math.min(a, b);
    }
}