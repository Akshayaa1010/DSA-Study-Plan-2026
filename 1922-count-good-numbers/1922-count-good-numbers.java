class Solution {
    int M = 1_000_000_007;

    public int countGoodNumbers(long n) {
        long e = (n + 1) / 2; // count of even indices
        long o = n / 2;       // count of odd indices
        return (int) ((pow(5, e) * pow(4, o)) % M);
    }

    private long pow(long x, long y) {
        long r = 1;
        x %= M;
        while (y > 0) {
            if ((y & 1) == 1) r = (r * x) % M;
            x = (x * x) % M;
            y >>= 1;
        }
        return r;
    }
}