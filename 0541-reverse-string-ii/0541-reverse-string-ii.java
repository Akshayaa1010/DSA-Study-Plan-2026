class Solution {
    public String reverseStr(String s, int k) {
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i += 2 * k) {
            int l = i, r = Math.min(i + k - 1, c.length - 1);
            while (l < r) {
                char t = c[l];
                c[l++] = c[r];
                c[r--] = t;
            }
        }
        return new String(c);
    }
}