class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int total = 0;
        
        for (int i = 0; i < n; i++) {
            total += mat[i][i];             // Primary diagonal
            total += mat[i][n - 1 - i];     // Secondary diagonal
        }
        
        // Subtract the center element if n is odd
        if (n % 2 == 1) {
            total -= mat[n / 2][n / 2];
        }
        
        return total;
    }
}
