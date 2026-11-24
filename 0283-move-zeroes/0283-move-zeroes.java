class Solution {
    public void moveZeroes(int[] nums) {
        int insertPos = 0; // Points to the position for the next non-zero element

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap elements only if the pointers are at different indices
                if (i != insertPos) {
                    int temp = nums[insertPos];
                    nums[insertPos] = nums[i];
                    nums[i] = temp;
                }
                insertPos++;
            }
        }
    }
}
