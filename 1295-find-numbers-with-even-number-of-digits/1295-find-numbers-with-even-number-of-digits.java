class Solution {
    public int findNumbers(int[] nums) {
        int evenDigitCount = 0;
        
        for (int num : nums) {
            int digits = 0;
            
            // Count the number of digits in the current integer
            while (num > 0) {
                num /= 10;
                digits++;
            }
            
            // Check if the digit count is even
            if (digits % 2 == 0) {
                evenDigitCount++;
            }
        }
        
        return evenDigitCount;
    }
}
