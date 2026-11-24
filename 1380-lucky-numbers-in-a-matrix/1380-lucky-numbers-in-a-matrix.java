import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int[] rowMin = new int[m];
        int[] colMax = new int[n];
        
        // 1. Find the minimum element in each row
        for (int i = 0; i < m; i++) {
            int minVal = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                minVal = Math.min(minVal, matrix[i][j]);
            }
            rowMin[i] = minVal;
        }
        
        // 2. Find the maximum element in each column
        for (int j = 0; j < n; j++) {
            int maxVal = Integer.MIN_VALUE;
            for (int i = 0; i < m; i++) {
                maxVal = Math.max(maxVal, matrix[i][j]);
            }
            colMax[j] = maxVal;
        }
        
        // 3. Collect elements that are both a row min and column max
        List<Integer> lucky = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == rowMin[i] && matrix[i][j] == colMax[j]) {
                    lucky.add(matrix[i][j]);
                }
            }
        }
        
        return lucky;
    }
}
