class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int row = 0;
        int col = n - 1;
        int count = 0;

        while (row < m && col >= 0) {
            if (grid[row][col] < 0) {
                // All elements below grid[row][col] in this column are also negative
                count += (m - row);
                col--;
            } else {
                // Move down to find smaller numbers
                row++;
            }
        }

        return count;
    }
}
