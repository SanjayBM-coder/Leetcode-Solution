class Solution {
    public int[] runningSum(int[] nums) {
        // Start from index 1 because index 0's running sum is already itself
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
