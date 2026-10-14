class Solution {
    public int findRadius(int[] h, int[] H) {
        java.util.Arrays.sort(h);
        java.util.Arrays.sort(H);
        int r = 0, i = 0;
        for (int x : h) {
            while (i < H.length - 1 && Math.abs(H[i + 1] - x) <= Math.abs(H[i] - x)) {
                i++;
            }
            r = Math.max(r, Math.abs(H[i] - x));
        }
        return r;
    }
}