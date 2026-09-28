class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[] tower = new double[101];
        tower[0] = poured;

        for (int row = 0; row < query_row; row++) {
            double[] nextRow = new double[101];
            for (int glass = 0; glass <= row; glass++) {
                if (tower[glass] > 1.0) {
                    double overflow = (tower[glass] - 1.0) / 2.0;
                    nextRow[glass] += overflow;
                    nextRow[glass + 1] += overflow;
                }
            }
            tower = nextRow;
        }

        return Math.min(1.0, tower[query_glass]);
    }
}