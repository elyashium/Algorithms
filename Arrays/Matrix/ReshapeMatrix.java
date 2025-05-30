class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        int total = m * n;

        if (total != (r * c)) {
            return mat;
        }

        int[][] output = new int[r][c];
        int outRows = 0;
        int outCols = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                output[outRows][outCols] = mat[i][j];
                outCols++;
                // if the columns(j) has reached the end then change the row
                // and set the values of j to 0 to fill the next row.

                if (outCols == c) {

                    outCols = 0;
                    outRows++;
                }
            }
        }
        return output;
    }
}