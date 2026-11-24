import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {
        // 1. Create a copy of the original array and sort it
        int[] expected = heights.clone();
        Arrays.sort(expected);
        
        int mismatchCount = 0;
        
        // 2. Compare elements at each index
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                mismatchCount++;
            }
        }
        
        // 3. Return the total number of mismatches
        return mismatchCount;
    }
}
